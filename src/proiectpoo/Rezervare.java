package proiectpoo;

public class Rezervare {
    Eveniment eveniment;
    //Persoana persoana;
    Loc[] locuri;

    public Rezervare(Eveniment eveniment, Loc[] locuri) {
        this.eveniment = eveniment;
        this.locuri = locuri;
    }

    public Eveniment getEveniment() {
        return eveniment;
    }

    public void setEveniment(Eveniment eveniment) {
        this.eveniment = eveniment;
    }

    public Loc[] getLocuri() {
        return locuri;
    }

    public void setLocuri(Loc[] locuri) {
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
