package proiectpoo;

class Zona {
    int id;
    float pret;
    Loc[] locuri;

    public Zona(int id, float pret) {
        this.id = id;
        this.pret = pret;
    }

    Zona() {
        this.locuri = new Loc[0];
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

    public Loc[] getLocuri() {
        return locuri;
    }

    public void setLocuri(Loc[] locuri) {
        this.locuri = locuri;
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
