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
    private int durata;
    
    public PiesaTeatru()
    {
        super();
        this.regizor="";
        this.autor="";
        this.durata=0;
    }
    
    public PiesaTeatru(String denumire, Date data, String regizor, String autor, int durata)
    {
        super(denumire, data);
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

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
    
}
