/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class FilmFörstörd {

    public static void Seter(FilmObjekt film)/*(String filmnamn, String regissör, int genre,
            int längd, Date release, int betyg, int settGånger, Date settDatum,
            String beskrivning)*/ {
        int regissör = 0;
        regissör = regissörSet(film.Regissör);
        int kategori = omvandla.Strang.genreToId(film.Genre);
        try {
            Connection connection = ConnectionFactory.getConnection();

            try {
                String query = "INSERT INTO filmregister (filmnamn, regissör, "
                        + "genre, längd, releasedatum, betyg, sett_gånger, "
                        + "beskrivning, sett_datum, redigerad_datum)"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                Calendar calandar = Calendar.getInstance();
                java.sql.Timestamp startDate = new java.sql.Timestamp(calandar.getTime().getTime());

                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, film.Filmnamn.toLowerCase());
                preparedStatement.setInt(2, regissör);
                preparedStatement.setInt(3, kategori);
                preparedStatement.setInt(4, film.Längd);
                preparedStatement.setString(5, film.getRelease());
                preparedStatement.setInt(6, film.getBetyg());
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
                openRedigera(film.Filmnamn);
                System.out.println("Öppnade ny jFrame då felet: " + e + " <-- upstod");
            }
        } catch (Exception e) {
            System.out.println("Connectionfel " + e);

        }
    }

    public static int regissörSet(String regissör) {
        regissör = regissör.toLowerCase();

        int reg = 0;
        try {
            Connection connection = ConnectionFactory.getConnection();
            try {
                String query = "INSERT INTO regissör (id,namn) VALUES(NULL,?);";
                PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement.setString(1, regissör);
                preparedStatement.executeUpdate();

                ResultSet rs = preparedStatement.getGeneratedKeys();

                if (rs.next()) {
                    reg = rs.getInt(1);
                }

            } catch (MySQLIntegrityConstraintViolationException e) {
                try {
                    System.out.println("regissören fanns redan " + e);
                    //Ny querri där jag hämtar regissörens id 
                    String query2 = "SELECT id FROM regissör WHERE namn = ?;";
                    PreparedStatement hamtaId = connection.prepareStatement(query2);
                    hamtaId.setString(1, regissör);
                    hamtaId.executeQuery();
                    ResultSet rs2 = hamtaId.getResultSet();
                    if (rs2.next()) {
                        reg = rs2.getInt(1);
                    }
                    return reg;

                } catch (Exception f) {
                    System.out.println("Fel i hämning av id i regisörGet "+e);
                }
            }
            try {
                connection.close();
            } catch (Exception e) {
                System.out.println("Misslyckades stänga connection i Regissör\n" + e);
            }

        } catch (Exception e) {
            System.out.println("Misslyckades med connection i Regissör \n" + e);
        }
        return reg;
    }

    public static void openRedigera(String filmnamn) {
        GUI.adminRedigera.film(filmnamn);
        GUI.adminRedigera redigera = new GUI.adminRedigera();

        redigera.setVisible(true);
    }

    public static void change(String oldFilmnamn, FilmObjekt film) {
        try {
            Delete(oldFilmnamn);
            Seter(film);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problem i change metoden");
            System.out.println("Connectionfel i change " + e);
        }
    }

    public static void Delete(String filmnamn) throws Exception {
        String gamalfilm = filmnamn.toLowerCase();
        Connection connection = ConnectionFactory.getConnection();
        String query = "DELETE FROM filmregister WHERE filmnamn = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, gamalfilm);
        preparedStatement.execute();
        try {
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
        }
    }
//Hämtar information om en bestämd film
    public static FilmObjekt GeterFilmnamn(String söktNamn) {
        FilmObjekt film = new FilmObjekt();
        try {

            Connection connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM filmregister WHERE `filmnamn` = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            /*preparedStatement.setString(1, sökt = *);*/
            // preparedStatement.setString(1,söktI);
            preparedStatement.setString(1, söktNamn);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();

            //problemet läggs in härSystem.out.println(filmer.size());
            if (rs.next()) {

                film.Filmnamn = rs.getString("filmnamn");
                film.Regissör = regissörGet(film.Filmnamn);
                film.Beskrivning = rs.getString("beskrivning");
                film.Genre = genreGet(film.Filmnamn);
                film.Längd = rs.getInt("längd");
                film.setRelease(rs.getString("releasedatum"));
                film.SettDatum = null;
                film.SettGånger = 0;
                film.setBetyg(rs.getInt("betyg"));

                return film;
            }

            try {
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "misslyckades stänga connection " + e);
            }

            try {
                preparedStatement.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "misslycakdes stänga prepared statement " + e);
            }
            try {
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "misslycakdes stänga resultSet " + e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fel i anslutningen/frågan");
            System.out.println("Connectionfel " + e);
        }

        return film;

    }

    public static String genreGet(String filmnamn) {
        String gen = "";
        try {
            Connection connection = ConnectionFactory.getConnection();

            try {
                //Ny querri där jag hämtar regissörens id 
                String query = "SELECT Genre FROM genre WHERE id = "
                        + "(SELECT genre FROM filmregister WHERE filmnamn = ?);";
                PreparedStatement hamtaNamn = connection.prepareStatement(query);
                hamtaNamn.setString(1, filmnamn);
                hamtaNamn.executeQuery();
                ResultSet rs = hamtaNamn.getResultSet();
                if (rs.next()) {
                    gen = rs.getString(1);
                }

                try {
                    rs.close();
                    hamtaNamn.close();
                    connection.close();

                } catch (Exception e) {
                    System.out.println("Misslyckades stänga saker i regissörGet " + e);
                }

            } catch (Exception e) {
                System.out.println("Query fail, regissörGet " + e);

            }

        } catch (Exception e) {
            System.out.println("Misslyckades med Connection i regissörGet" + e);
        }
        return gen;

    }

    public static String regissörGet(String filmnamn) {
        String reg = "null";
        try {
            Connection connection = ConnectionFactory.getConnection();

            try {
                //Ny querri där jag hämtar regissörens id 
                String query = "SELECT namn FROM regissör WHERE id = "
                        + "(SELECT regissör FROM filmregister WHERE filmnamn = ?);";
                PreparedStatement hamtaId = connection.prepareStatement(query);
                hamtaId.setString(1, filmnamn);
                hamtaId.executeQuery();
                ResultSet rs = hamtaId.getResultSet();
                if (rs.next()) {
                    reg = rs.getString(1);
                }

                try {
                    rs.close();
                    hamtaId.close();
                    connection.close();

                } catch (Exception e) {
                    System.out.println("Misslyckades stänga saker i regissörGet " + e);
                }

            } catch (Exception e) {
                System.out.println("Query fail, regissörGet " + e);

            }

        } catch (Exception e) {
            System.out.println("Misslyckades med Connection i regissörGet" + e);
        }
        return reg;

    }

    public static ArrayList<FilmObjekt> getFilmerAvGenre(String genrenNamn) {
        int genreId = omvandla.Strang.genreToId(genrenNamn);
        ArrayList<FilmObjekt> filmer = new ArrayList<>();

        try {
            Connection connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM filmregister WHERE genre = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, genreId);
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();

            while (rs.next()) {
                FilmObjekt film = new FilmObjekt();
                film.Filmnamn = rs.getString("filmnamn");
                film.Regissör = regissörGet(film.Filmnamn);
                film.Beskrivning = rs.getString("beskrivning");
                film.Genre = genreGet(film.Filmnamn);
                film.Längd = rs.getInt("längd");
                film.setRelease(rs.getString("releasedatum"));
                film.SettDatum = null;
                film.SettGånger = 0;
                film.setBetyg(rs.getInt("betyg"));

                filmer.add(film);
            }
            try {
                rs.close();
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println("Lyckades inte stänga getFilmAvGenre " + e);
            }
        } catch (Exception e) {
            System.out.println("Anslutningsfel i getFilmAvGenre " + e);
        }
        return filmer;
    }
    //returnerar ALLA filmer ur databasen.

    public static ArrayList<FilmObjekt> getAllaFilmer() {

        ArrayList<FilmObjekt> filmer = new ArrayList<>();
        try {
            Connection connection = ConnectionFactory.getConnection();
            String query = "SELECT * FROM filmregister;";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            /*preparedStatement.setString(1, sökt = *);*/
            preparedStatement.executeQuery();
            ResultSet rs = preparedStatement.getResultSet();

            //problemet läggs in härSystem.out.println(filmer.size());
            while (rs.next()) {
                FilmObjekt film = new FilmObjekt();
                film.Filmnamn = rs.getString("filmnamn");
                film.Regissör = regissörGet(film.Filmnamn);
                film.Beskrivning = rs.getString("beskrivning");
                film.Genre = genreGet(film.Filmnamn);
                film.Längd = rs.getInt("längd");
                film.setRelease(rs.getString("releasedatum"));
                film.SettDatum = null;
                film.SettGånger = 0;
                film.setBetyg(rs.getInt("betyg"));

                filmer.add(film);
                System.out.println(filmer.size());
            }

            try {
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "misslyckades stänga connection " + e);
            }
            try {
                preparedStatement.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "misslycakdes stänga prepared statement " + e);
            }
            try {
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "misslycakdes stänga resultSet " + e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Anslutningsproblem i getAllaFilmer");
            System.out.println("Connectionfel " + e);

        }
        return filmer;

    }
}

/*public static void Redigera(String filmnamn){
Redigera redigera = new Redigera();
redigera.setVisible(true);

}*/
