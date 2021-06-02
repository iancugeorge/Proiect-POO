/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectpoo;

import java.util.Date;

/**
 *
 * @author Razvan
 */
public class PiesaTeatru extends Eveniment {
    private String regizor;
    private String autor;
    private float durata;
    
    public PiesaTeatru()
    {
        super();
        this.regizor="";
        this.autor="";
        this.durata=0;
    }
    
    public PiesaTeatru(String denumire, Date data, Sala sala, String regizor, String autor, float durata)
    {
        super(denumire, data, sala);
        this.regizor=regizor;
        this.autor=autor;
        this.durata=durata;
    }

    public String getRegizor() {
        return regizor;
    }

    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getDurata() {
        return durata;
    }

    public void setDurata(float durata) {
        this.durata = durata;
    }
    
}
