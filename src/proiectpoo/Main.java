package proiectpoo;

public class Main {

    public static void main(String[] args) {
        
        Sala s = new Sala("Sala Palatului", "Str. Strada 3");
        
        Zona[] zone = new Zona[5];
        for(int i=0; i<5; i++){
            zone[i] = new Zona();
        }
        
        zone[0].setId(1);
        zone[0].setPret(2.5f);
        
        Loc[] locuri = new Loc[100];
        for(int i=0; i<100; i++){
            locuri[i] = new Loc(i+1);
        }
        
        zone[0].setLocuri(locuri);
        
        s.setZone(zone);
        System.out.println(s);
        int x;
        
    }
    
}
