/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Connection;

/**
 *
 * @author daca97002
 */
public class Project2Filmproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String userName = "root";
            String password = "";
            Connection connection = ConnectionFactory.getConnection(userName, password);
            //lägg till Hunt for the Wilderpeople till databasen, testa sen skriv ut (lägg bara till med ren kod)
        } catch (Exception e) {
        }
    }

}
