package proiectpoo;

import java.util.Date;

public class Concert extends Eveniment {
    
    String artist;
        
    public Concert(String denumire, Date data, Sala sala) {
        super(denumire, data, sala);
        this.artist = artist;
    }

    Concert() {
        super();
        this.artist = "";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Concert{sala=").append(this.getSala());
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
