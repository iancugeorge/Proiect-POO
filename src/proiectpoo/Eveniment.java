package proiectpoo;

import java.util.Date;

public class Eveniment {
    private int id;
    private String denumire;
    private Date data;
    
    private static int nextId = 0;

    public Eveniment() {
        this.id = nextId;
        this.denumire = "FARA DENUMIRE";
        this.data = new Date();
        
        nextId++;
    }
    
    public Eveniment(String denumire, Date data) {
        this.id = nextId;
        this.denumire = denumire;
        this.data = data;
        
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
    
}
