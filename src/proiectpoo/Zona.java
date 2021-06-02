package proiectpoo;

import java.util.Vector;

class Zona {
    int id;
    float pret;
    Vector<Loc> locuri = new Vector<>();

    public Zona(int id, float pret) {
        this.id = id;
        this.pret = pret;
    }
    
    public Zona(int id, float pret, Vector<Loc> locuri) {
        this.id = id;
        this.pret = pret;
        this.locuri = locuri;
    }

    public Zona() {
        this.locuri = null;
        this.id = 0;
        this.pret = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public Vector<Loc> getLocuri() {
        return locuri;
    }

    public void setLocuri(Vector<Loc> locuri) {
        this.locuri = locuri;
    }
    
    public String printIdPret(){
        String out = "Zona{" + "id=" + id + ", pret=" + pret + "}\n";
        return out;
    }
    
    @Override
    public String toString() {
        String out = "Zona{" + "id=" + id + ", pret=" + pret + "}\n";
        for(Loc loc:locuri){
            out = out + loc + "\n";
        }
        return out;
    }
    
    
}
