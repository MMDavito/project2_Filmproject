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
   FilmObjekt film = new FilmObjekt();
   film = FilmFörstörd.getInfo("filmnamn","fsdfsd");
        System.out.println("kommer ifrån main: "+film.Filmnamn);
    }
}


