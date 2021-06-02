package proiectpoo;

import java.util.Date;

public class Eveniment {
    private int id;
    private String denumire;
    private Date data;
    private Sala sala;
    
    private static int nextId = 0;

    public Eveniment() {
        this.id = nextId;
        this.denumire = "FARA DENUMIRE";
        this.data = new Date();
        
        nextId++;
    }
    
    public Eveniment(String denumire, Date data, Sala sala) {
        this.id = nextId;
        this.denumire = denumire;
        this.data = data;
        this.sala = sala;
        
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Eveniment{" + "id=" + id + ", denumire=" + denumire + ", data=" + data + '}';
    }
    
    public String printZone(){
        String out = "";
        for(Zona zona:this.sala.getZone()){
            out += zona.printIdPret();
        }
        return out;
    }

    Zona getZonaById(int idZona) {
        for(Zona zona:this.sala.getZone()){
            if(zona.getId() == idZona)
                return zona;
        }
        return null;
    }
    
    
}
