/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getSet;

/**
 *
 * @author daca97002
 */
public class genre {
    public static int jComboBoxToIndex(String kategori){
        int genreNummer = 0;
                switch ((kategori)) {
            case "action":
                genreNummer = 1;
                break;
            case "comedy":
                genreNummer = 2;
                break;
            case "romance":
                genreNummer = 3;
                break;
            case "war":
                genreNummer = 4;
                break;
            case "documentery":
                genreNummer = 5;
                break;               
        }
                return genreNummer;
            
    }
}
