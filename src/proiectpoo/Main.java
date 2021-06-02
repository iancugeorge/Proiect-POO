package proiectpoo;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
     
        Scanner scanner = new Scanner(System.in);
        Driver driver = Driver.getInstance();
        
        boolean run = true;
        while(run){
            System.out.println("------- MANAGER DE EVENIMENTE -------");
            System.out.println("-------------------------------------");
            System.out.println("1. USER");
            System.out.println("2. AGENTIE DE EVENIMENTE");
            int k = scanner.nextInt();
            switch(k){
                case 1:{
                    System.out.println("1. Creare cont");
                    System.out.println("2. Rezervare bilete");
                    int o = scanner.nextInt();
                    switch(o)
                    {
                        case 1:{
                            driver.addPersoana();
                            break;
                        }
                        case 2:{
                            driver.addRezervare();
                            break;
                        }
                        default:{
                            System.out.println("Optine invalida");
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("1. Adaugare sala de spectacole");
                    System.out.println("2. Adaugare eveniment");
                    System.out.println("3. Vizualizare Sali de spectacol");
                    System.out.println("4. Vizualizare Evenimente");
                    System.out.println("5. Vizualizare Conturi");
                    System.out.println("6. Vizualizare Rezervari");
                    int o = scanner.nextInt();
                    switch(o)
                    {
                        case 1:{
                            driver.addSala();
                            break;
                        }
                        case 2:{
                            driver.addEveniment();
                            break;
                        }
                        case 3:{
                            driver.afisareSali();
                            break;
                        }
                        case 4:{
                            driver.afisareEvenimente();
                            break;
                        }
                        case 5:{
                            driver.afisarePersoane();
                            break;
                        }
                        case 6:{
                            driver.afisareRezervari();
                            break;
                        }
                        default:{
                            System.out.println("Optine invalida");
                        }
                    }
                    break;
                }
            }
        }
        
                
    }
}