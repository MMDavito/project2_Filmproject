/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
        try {
            String userName = "root";
            String password = "";
            Connection connection = ConnectionFactory.getConnection(userName, password);
            //lägg till Hunt for the Wilderpeople till databasen, testa sen skriv ut (lägg bara till med ren kod)
            Calendar calandar = Calendar.getInstance();
            java.sql.Date startDate = new java.sql.Date(calandar.getTime().getTime());

            String query = " insert into filmregister (filmnamn, regissör, redigerad_datum)" + "values (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Hunt for the Wilderpeople");
            preparedStatement.setString(2, "Taika Waititi");
            preparedStatement.setDate(3, startDate);
            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}

