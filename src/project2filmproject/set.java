/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.Calendar;

/**
 *
 * @author daca97002
 */
public class set {
      public static void seter(String filmnamn, String regissör, String genre, 
              Time längd, Date release, int betyg, int settGånger, Date settDatum,
              String beskrivning){
          try {
            String userName = "root";
            String password = "";
            Connection connection = ConnectionFactory.getConnection(userName, password);
            //lägg till Hunt for the Wilderpeople till databasen, testa sen skriv ut (lägg bara till med ren kod)
            Calendar calandar = Calendar.getInstance();
            java.sql.Timestamp startDate = new java.sql.Timestamp(calandar.getTime().getTime());

            String query = " insert into filmregister (filmnamn, regissör, "
                    + "genre, längd, releasedatum, betyg, sett_gånger, "
                    + "beskrivning, sett_datum redigerad_datum)" 
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, filmnamn);
            preparedStatement.setString(2, regissör);
            preparedStatement.setString(3, genre);
            preparedStatement.setTime(4, längd);
            preparedStatement.setDate(5, release);
            preparedStatement.setInt(6, betyg);
            preparedStatement.setInt(7, settGånger);
            preparedStatement.setString(8, beskrivning);
            preparedStatement.setDate(9, settDatum);
            preparedStatement.setTimestamp(10, startDate);
            preparedStatement.execute();
            connection.close();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
}
