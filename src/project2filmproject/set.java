/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class set {

    public static void seter(String filmnamn, String regissör, int genre,
            int längd, Date release, int betyg, int settGånger, Date settDatum,
            String beskrivning) {
        try {
            Connection connection = ConnectionFactory.getConnection();

            try {
                String query = "insert into filmregister (filmnamn, regissör, "
                        + "genre, längd, releasedatum, betyg, sett_gånger, "
                        + "beskrivning, sett_datum, redigerad_datum)"
                        + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                Calendar calandar = Calendar.getInstance();
                java.sql.Timestamp startDate = new java.sql.Timestamp(calandar.getTime().getTime());
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, filmnamn);
                preparedStatement.setString(2, regissör);
                preparedStatement.setInt(3, genre);
                preparedStatement.setInt(4, längd);
                preparedStatement.setDate(5, release);
                preparedStatement.setInt(6, betyg);
                preparedStatement.setInt(7, settGånger);
                preparedStatement.setString(8, beskrivning);
                preparedStatement.setDate(9, settDatum);
                preparedStatement.setTimestamp(10, startDate);
                preparedStatement.execute();
                connection.close();
            } catch (MySQLIntegrityConstraintViolationException e) {
                OpenRedigera(filmnamn);
                System.out.println("Öppnade ny jFrame då felet: " + e + " <-- upstod");
            }
        } catch (Exception e) {
            System.out.println("Connectionfel " + e);
        }
    }

    public static void OpenRedigera(String filmnamn) {
        GUI.adminRedigera.film(filmnamn);
        GUI.adminRedigera redigera = new GUI.adminRedigera();

        redigera.setVisible(true);
    }

    public static void Change(String filmnamn, String regissör, int genre,
            int längd, Date release, int betyg, int settGånger, Date settDatum,
            String beskrivning) {
        try {
            Connection connection = ConnectionFactory.getConnection();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Starta databasen ");
            System.out.println("Connectionfel " + e);
        }
    }

    public static void Delete(String filmnamn) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            String query = "DELETE FROM filmregister WHERE filmnamn = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, filmnamn);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Starta databasen ");
            System.out.println("Connectionfel " + e);
        }
    }

}

/*public static void Redigera(String filmnamn){
Redigera redigera = new Redigera();
redigera.setVisible(true);

}*/
