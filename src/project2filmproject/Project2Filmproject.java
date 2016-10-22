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
    /*ArrayList<FilmObjekt> filmer = new ArrayList<>();
        filmer = FilmFörstörd.getAllaFilmer();

        System.out.println(filmer.size());
        
        for(FilmObjekt film:filmer){
            
            System.out.println("Filmnamn " + film.Genre);
            
        }*/
String minuter;
String timmar;
time tid = new time();
        try {tid =omvandla.time.secToTime(-1);
            System.out.println(time.timar+" Tim " + tid.minuter + " Min");
            
        } catch (Exception e) {System.out.println(e);
        }
    }
}


