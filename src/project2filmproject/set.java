/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//vackert underbart
package project2filmproject;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class Set {

    /**
     *
     * @param film Vill få en arraylist
     * @return
     */
    public static void Seter(FilmObjekt film)/*(String filmnamn, String regissör, int genre,
            int längd, Date release, int betyg, int settGånger, Date settDatum,
            String beskrivning)*/ {
         
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
                preparedStatement.setString(1, film.Filmnamn);
                preparedStatement.setString(2, film.Regissör);
                preparedStatement.setInt(3, film.Genre);
                preparedStatement.setInt(4, film.Längd);
                preparedStatement.setDate(5, film.Release);
                preparedStatement.setInt(6, film.Betyg);
                preparedStatement.setInt(7, film.SettGånger);
                preparedStatement.setString(8, film.Beskrivning);
                preparedStatement.setDate(9, film.SettDatum);
                preparedStatement.setTimestamp(10, startDate);
                preparedStatement.execute();
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (Exception e) {
                    System.out.println("Misslyckades avsluta " + e);
                }

            } catch (MySQLIntegrityConstraintViolationException e) {
                OpenRedigera(film.Filmnamn);
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

    public static void Change(String oldFilmnamn, FilmObjekt film) {
        try {
            Connection connection = ConnectionFactory.getConnection();

            Delete(oldFilmnamn);
            Seter(film);

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
