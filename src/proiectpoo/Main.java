package proiectpoo;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
     
        Driver driver = new Driver();
        
        driver.addSala();
        for(Sala sala:driver.getSali()){
            System.out.println(sala);
        }
    }
}
