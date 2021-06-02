package proiectpoo;

import java.util.Vector;

public class Rezervare {
    Eveniment eveniment;
    Persoana persoana;
    Vector<Loc> locuri;

    public Rezervare(Persoana persoana, Eveniment eveniment, Vector<Loc> locuri) {
        this.persoana = persoana;
        this.eveniment = eveniment;
        this.locuri = locuri;
    }

    public Eveniment getEveniment() {
        return eveniment;
    }

    public void setEveniment(Eveniment eveniment) {
        this.eveniment = eveniment;
    }

    public Vector<Loc> getLocuri() {
        return locuri;
    }

    public void setLocuri(Vector<Loc> locuri) {
        this.locuri = locuri;
    }

    @Override
    public String toString() {
        String out = "Rezervare{" + "eveniment=" + eveniment + ", locuri=";
        for(Loc loc:locuri){
            out += "\n" + loc;
        }
        return out;
    }
    
    
    
}
