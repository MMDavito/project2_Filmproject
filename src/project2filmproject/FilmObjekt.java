/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class FilmObjekt {

    public String Filmnamn;
    public String Regissör;
    public String Genre;
    public int Längd;
    private String Release;

    public String getRelease() {
        return Release;
    }

    public void setRelease(String Release) {
        try {
            int år = Integer.parseInt(Release);
            if (år > 1900 && år < 2200) {
                this.Release = Release;
            } else {
                JOptionPane.showMessageDialog(null, "Saknar giltigt datum för filmen");
                this.Release = "0";
            }

        } catch (Exception e) {
            System.out.println("Fail i omvandling av release till int " + e);
            this.Release = "";
        }
    }

    public void dbSetRelease(String Release) {
        this.Release = Release;
    }

    private int Betyg;
    public String Beskrivning;

    public int getBetyg() {
        return Betyg;
    }

    public void setBetyg(int Betyg) {
        if (Betyg >= 0 && Betyg <= 100) {
            this.Betyg = Betyg;
        } else {
            this.Betyg = 0;
        }
    }
}
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

