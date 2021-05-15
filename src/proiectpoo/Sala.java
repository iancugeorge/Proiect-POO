package proiectpoo;

public class Sala {
    String denumire;
    int nrLocuri;
    Zona[] zone;
    String adresa;

    public Sala() {
        this.denumire = "NEINITIALIZAT";
        this.nrLocuri = 0;
        this.zone = new Zona[0];
        this.adresa = "NEINITIALIZAT";
    }

    public Sala(String denumire, int nrLocuri, String adresa) {
        this.denumire = denumire;
        this.nrLocuri = nrLocuri;
        this.adresa = adresa;
    }
}
