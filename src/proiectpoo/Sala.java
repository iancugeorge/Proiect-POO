package proiectpoo;

import java.util.Vector;

public class Sala {
    String denumire;
    int nrLocuri;
    Vector<Zona> zone = new Vector<>(0);
    String adresa;

    public Sala() {
        this.denumire = "NEINITIALIZAT";
        this.nrLocuri = 0;
        this.adresa = "NEINITIALIZAT";
    }

    public Sala(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
    }
    
    public Sala(String denumire, String adresa, Vector<Zona> zone, int nrLocuri) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.zone = zone;
        this.nrLocuri = nrLocuri;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public Vector<Zona> getZone() {
        return zone;
    }

    public void setZone(Vector<Zona> zone) {
        this.zone = zone;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        String out = "Sala{" + "denumire=" + denumire + ", nrLocuri=" + nrLocuri + ", adresa=" + adresa + "}\n";
        for(Zona zona:zone){
            out = out + zona + "\n";
        }
        
        return out;
        
    }
    
    
    
    
}
