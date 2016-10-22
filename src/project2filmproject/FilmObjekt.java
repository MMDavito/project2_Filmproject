/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Date;

/**
 *
 * @author daca97002
 */
public class FilmObjekt {
    public String Filmnamn; 
    public String Regissör;
    public String Genre;
    public int Längd; 
    public Date Release; 
    private int Betyg; 
    public int SettGånger;     
    public String Beskrivning;
    public Date SettDatum;

    public int getBetyg() {
        return Betyg;
    }

    public void setBetyg(int Betyg) {
        if (Betyg>=0 && Betyg<= 100){
            this.Betyg = Betyg;}
        else{this.Betyg = 0;}
    }}
    //construktor
    /*public FilmObjekt(String filmnamn, String regissör, int genre,
            int längd, Date release, int betyg, int settGånger, Date settDatum,
            String beskrivning){
    Filmnamn = filmnamn;
    Regissör=regissör;
    Genre = genre;
    Längd = längd;
    Release = release;
    Betyg = betyg;
    SettGånger = settGånger;
    SettDatum = settDatum;
    Beskrivning = beskrivning;
    
    }
*/
//construktor
 
