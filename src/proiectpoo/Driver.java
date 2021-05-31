package proiectpoo;

import java.util.Scanner;
import java.util.Vector;

public class Driver {
    
    private Vector<Eveniment> evenimente = null;
    private Vector<Sala> sali = null;
    //private Vector<Persoana> persone = null; 
    private Vector<Rezervare> rezervari = null;

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
        Sala sala = new Sala();
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creaza o noua Sala: \n");
        
        System.out.println("Denumire: ");
        String denumire = scanner.nextLine();
        
        System.out.println("Adresa: ");
        String adresa = scanner.nextLine();
        
        System.out.println("Nr de zone: ");
        int nrZone = scanner.nextInt();
        
        Vector<Zona> zone = null;
        
        for(int i=0; i<nrZone; i++){
            Zona zona = new Zona();
            zone.addElement(zona);
        }
        
        
        sali.addElement(sala);
    }
    
}
