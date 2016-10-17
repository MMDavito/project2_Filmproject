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
    public String Filnamn; 
    public String Regissör;
    public int Genre;
    public int Längd; 
    public Date Release; 
    public int Betyg; 
    public int SettGånger;     
    public String Beskrivning;
    public Date SettDatum;
    //construktor
    public FilmObjekt(String filmnamn, String regissör, int genre,
            int längd, Date release, int betyg, int settGånger, Date settDatum,
            String beskrivning){
    Filnamn = filmnamn;
    Regissör=regissör;
    Genre = genre;
    Längd = längd;
    Release = release;
    Betyg = betyg;
    SettGånger = settGånger;
    SettDatum = settDatum;
    Beskrivning = beskrivning;
    
    }
    }
//construktor
 
