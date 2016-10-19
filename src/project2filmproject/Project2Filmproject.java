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
    ArrayList<FilmObjekt> filmer = new ArrayList<>();
        filmer = FilmFörstörd.getInfo("filmnamn", "fsdfsd");
        /*while (filmer.next()) {
            Object next = filmer.next();
            
        }*/
        
        System.out.println(filmer);
    }
}

