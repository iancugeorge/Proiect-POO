package proiectpoo;

import java.util.Scanner;
import java.util.Vector;

public class Driver {
    
    private Vector<Eveniment> evenimente = new Vector<Eveniment>(0);
    private Vector<Sala> sali = new Vector<Sala>(0);
    //private Vector<Persoana> persone = null; 
    private Vector<Rezervare> rezervari = new Vector<Rezervare>();

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
        
        Vector<Zona> zone = new Vector<Zona>(0);
        
        int nrLocuriTotale = 0;
        
        for(int i=0; i<nrZone; i++){
            
            
            System.out.println("Nr de locuri pentru zona "+(i+1)+": ");
            int nrLocuri = scanner.nextInt();
            nrLocuriTotale += nrLocuri;
            Vector<Loc> locuri = new Vector<Loc>(0);
            
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
    
}
