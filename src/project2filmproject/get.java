/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2filmproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author daca97002
 */
public class get {

    public static String GeterFilmnamn(String filmnamn) {
       return ""; }
    
    
        public static ArrayList<filmInfo> getInfo(String sökt, String källa, String id){
            
        ResultSet rs = null;
                    try {
                        
            Connection connection = ConnectionFactory.getConnection();
            String query = "SELECT ? FROM filmregister WHERE ? = ? ";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, sökt);
            preparedStatement.setString(2, källa);
            preparedStatement.setString(3, id);
           rs = preparedStatement.executeQuery();
            
                        try {
                            connection.close();
                            preparedStatement.close();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "misslycakdes stänga connection " + e);
                        }
                        

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Starta databasen ");
            System.out.println("Connectionfel " + e);
    }return rs;
    }
    

        
        

   

   /* public static void GeterGenre(int genreId) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            String query = "";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Starta databasen ");
            System.out.println("Connectionfel " + e);
        }
    }*/
    }
    
