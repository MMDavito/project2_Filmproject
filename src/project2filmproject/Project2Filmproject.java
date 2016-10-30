/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import omvandla.time;

/**
 *
 * @author daca97002
 */
public class Project2Filmproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<FilmObjekt> filmer = new ArrayList<>();
        filmer = FilmFörstörd.getAllaFilmer();

       
        
        for(FilmObjekt film:filmer){
            
            System.out.println(film.Filmnamn+" " + film.getRelease());
            
        }
        /*
        int minuter;
        int timmar;
        int sekunder;
        time tid = new time();
        timmar = 0;
        minuter = 120;
        try {
            sekunder = omvandla.time.timeToSec(timmar, minuter);
            tid = omvandla.time.secToTime(sekunder);
            System.out.println(time.timar + " Tim " + tid.minuter + " Min");
        } catch (Exception e) {
            System.out.println("Format fel i tid " + e);
        }*/

    }
}
