package proiectpoo;

import java.util.Date;

public class Concert extends Eveniment {
    
    Sala sala;
    
    public Concert(String denumire, Date data) {
        super(denumire, data);
        this.sala = new Sala();
    }
    
    public Concert(String denumire, Date data, Sala sala) {
        super(denumire, data);
        this.sala = sala;
    }

    Concert() {
        super();
        this.sala = new Sala();
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Concert{sala=").append(sala);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
