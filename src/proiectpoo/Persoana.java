/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

/**
 *
 * @author Razvan
 */
public class Persoana {
    private String nume;
    private String prenume;
    private String email;
    
    public Persoana()
    {
        this.nume="";
        this.prenume="";
        this.email="";
    }
    
    public Persoana(String nume, String prenume, String email)
    {
        this.nume=nume;
        this.prenume=prenume;
        this.email=email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persoana{" + "nume=" + nume + ", prenume=" + prenume + ", email=" + email + '}';
    }
    
}
