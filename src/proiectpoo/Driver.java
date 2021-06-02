package proiectpoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Driver {
    
    private static Driver driverInstance = null;
    private Vector<Eveniment> evenimente;
    private Vector<Sala> sali;
    private Vector<Persoana> persoane; 
    private Vector<Rezervare> rezervari;

    public static Driver getInstance(){
        if(driverInstance == null){
            driverInstance = new  Driver();
        }
        return driverInstance;  
    }
    
    private Driver() {
        this.rezervari = new Vector<>(0);
        this.persoane = new Vector<>(0);
        this.sali = new Vector<>(0);
        this.evenimente = new Vector<>(0);
    }

    public Vector<Eveniment> getEvenimente() {
        return evenimente;
    }

    public void setEvenimente(Vector<Eveniment> evenimente) {
        this.evenimente = evenimente;
    }

    public Vector<Sala> getSali() {
        return sali;
    }

    public void setSali(Vector<Sala> sali) {
        this.sali = sali;
    }

    public Vector<Rezervare> getRezervari() {
        return rezervari;
    }

    public void setRezervari(Vector<Rezervare> rezervari) {
        this.rezervari = rezervari;
    }
    
    public void addSala(){             
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creaza o noua Sala: \n");
        
        System.out.println("Denumire: ");
        String denumire = scanner.nextLine();
        
        System.out.println("Adresa: ");
        String adresa = scanner.nextLine();
        
        System.out.println("Nr de zone: ");
        int nrZone = scanner.nextInt();
        
        Vector<Zona> zone = new Vector<>(0);
        
        int nrLocuriTotale = 0;
        
        for(int i=0; i<nrZone; i++){
            
            
            System.out.println("Nr de locuri pentru zona "+(i+1)+": ");
            int nrLocuri = scanner.nextInt();
            nrLocuriTotale += nrLocuri;
            Vector<Loc> locuri = new Vector<>(0);
            
            for(int j=0; j<nrLocuri; j++){
                Loc loc = new Loc(j+1);
                locuri.addElement(loc);
            }
            
            System.out.println("Pretul zonei: ");
            float pret = scanner.nextFloat();
            
            Zona zona = new Zona(i+1, pret, locuri);
            zone.addElement(zona);
        }
        
        Sala sala = new Sala(denumire,adresa,zone,nrLocuriTotale);
        sali.addElement(sala);
    }

    void addPersoana() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creaza un nou utilizator : \n");
        
        System.out.println("Nume: ");
        String nume = scanner.nextLine();
        
        System.out.println("Prenume: ");
        String prenume = scanner.nextLine();
        
        System.out.println("Email: ");
        String email = scanner.nextLine();
        
        Persoana persoana = new Persoana(nume,prenume,email);
        persoane.add(persoana);
        
    }
    
    void addEveniment() throws ParseException{
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creaza un eveniment nou: \n");
        
        System.out.println("Denumire: ");
        String denumire = scanner.nextLine();
        
        System.out.println("Data (dd/ll/aaaa) : ");
        String dataStr = scanner.nextLine();
        Date data = new SimpleDateFormat("dd/mm/yyyy").parse(dataStr);
        
        boolean ok=false;
        
        while(!ok){
            System.out.println("1. Concert\n2. Piesa de teatru\n");
            int type = scanner.nextInt();
            scanner.nextLine();
            switch (type) {
                case 1:{
                    System.out.println("Concert: ");
                    System.out.println("Denumire sala de spectacol:");
                    String numeSala = scanner.nextLine();
                    Sala sala = getSalaByName(numeSala);
                    Concert concert = new Concert(denumire, data, sala);
                    evenimente.add(concert);
                    ok = true;
                    break;
                }
                case 2:{
                    System.out.println("Teatru: ");
                    
                    System.out.println("Denumire sala de spectacol:");
                    String numeSala = scanner.nextLine();
                    Sala sala = getSalaByName(numeSala);
                    System.out.println("Regizor:");
                    String regizor = scanner.nextLine();
                    System.out.println("Autor:");
                    String autor = scanner.nextLine();
                    System.out.println("Durata (minute) :");
                    float durata = scanner.nextFloat();
                    PiesaTeatru piesaTeatru = new PiesaTeatru(denumire, data, sala, regizor, autor, durata);
                    evenimente.add(piesaTeatru);
                    
                    ok = true;
                    break;
                }
                default:
                    System.out.println("Alegere invalida !");
                    break;
            }
        }
        
    }

    public Sala getSalaByName(String numeSala) {
        for(Sala sala:sali){
            if(sala.getDenumire().equals(numeSala)){
                return sala;
            }
        }
        return null;
    }
    
    public void addRezervare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fa o rezervare : \n");
        
        System.out.println("Pe numele: ");
        String nume = scanner.nextLine();
        System.out.println("Si prenumele: ");
        String prenume = scanner.nextLine();
        Persoana persoana = getPersoanaByName(nume,prenume);
        
        System.out.println("Denumire eveniment: ");
        String denumire = scanner.nextLine();
        Eveniment eveniment = getEvenimentByName(denumire);
       
        eveniment.printZone();
        System.out.println("Zona: ");
        int idZona = scanner.nextInt();
        scanner.nextLine();
        
        Zona zona = eveniment.getZonaById(idZona);
        
        System.out.println("Nr. de locuri: ");
        int nrLocuri = scanner.nextInt();
        scanner.nextLine();
        
        Vector<Loc> locuriDeRezervat = new Vector<>(0);
        locuriDeRezervat = getLocuriLibere(zona, nrLocuri);
        
        float pretTotal = calculatePret(nrLocuri, zona);
        
        System.out.println("Pretul total pentru rezervare este " + pretTotal + " lei.");
        System.out.println("Doresti sa rezervi? (y/n) ");
        String raspuns = scanner.nextLine();
        if(raspuns.equals("y")){
            Rezervare rezervare = new Rezervare(persoana, eveniment, locuriDeRezervat);
            
            for(Loc loc:locuriDeRezervat){
                loc.setRezervat(true);
            }
            
            rezervari.add(rezervare);
            
        }else{
            System.out.println("Rezervarea a fost anulata.");
        }
    }

    private float calculatePret(int nrLocuri, Zona zona) {
        return nrLocuri * zona.getPret();
    }

    private Persoana getPersoanaByName(String nume, String prenume) {
        for(Persoana pers:persoane){
            if(pers.getNume().equals(nume) && pers.getPrenume().equals(prenume)){
                return pers;
            }
        }
        return null;
    }

    private Eveniment getEvenimentByName(String denumire) {
        for(Eveniment ev:evenimente){
            if(ev.getDenumire().equals(denumire)){
                return ev;
            }
        }
        return null;
    }

    private Vector<Loc> getLocuriLibere(Zona zona, int nrLocuri) {
        Vector<Loc> locuri = new Vector<>();
        
        for(Loc loc:zona.getLocuri()){
            if(!loc.rezervat){
                locuri.add(loc);
                nrLocuri--;
            }
            if(nrLocuri == 0){
                return locuri;
            }
        }
        System.out.println("Nu sunt destule locuri disponibile.");
        return locuri;
    }
    
    public void afisareSali(){
        for(Sala sala:sali){
            System.out.println(sala);
        }
    }
    
    public void afisareEvenimente(){
        for(Eveniment eveniment:evenimente){
            System.out.println(eveniment);
        }
    }
    
    public void afisarePersoane(){
        for(Persoana persoana:persoane){
            System.out.println(persoana);
        }
    }
    
    public void afisareRezervari(){
        for(Rezervare rezervare:rezervari){
            System.out.println(rezervare);
        }
    }
    
}
