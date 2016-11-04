/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omvandla;

/**
 *
 * @author daca97002
 */
public class Strang {

    public static String toFirstCap(String ord) {
        String stBokstav = ord.substring(0, 1).toUpperCase();
        String stOrd = stBokstav + ord.substring(1);
        return stOrd;
    }

    public static int genreToId(String kategori) throws IllegalArgumentException {
        kategori = kategori.toLowerCase();
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
            case "undefined":
                genreNummer = 6;
                break;
            case "flumeri":
                genreNummer = 7;
                break;
            default:
                genreNummer = -1;
        }
        if (kategori.isEmpty() == true) {
            genreNummer = -2;
        }
        //TÖMM MEDELANDE OM ANVÄNDARE GER KORREKT VÄRDE
        if (genreNummer > 0) {
            return genreNummer;
        } else {
            throw new IllegalArgumentException("Genre saknas");
        }
    }

    public static String genreIdToString(int genreId) throws IllegalArgumentException {
        String kategori = null;
        if (genreId < 1) {
            throw new IllegalArgumentException("genreId måste va >=1");
        }
        if (genreId > 7) {
            throw new IllegalArgumentException("genreId måste va <=7");
        } else {
            switch ((genreId)) {
                case 1:
                    kategori = "action";
                    break;
                case 2:
                    kategori = "comedy";
                    break;
                case 3:
                    kategori = "romance";
                    break;
                case 4:
                    kategori = "war";
                    break;
                case 5:
                    kategori = "documentery";
                    break;
                case 6:
                    kategori = "undefined";
                    break;
                case 7:
                    kategori = "flumeri";
                    break;
            }
            kategori = toFirstCap(kategori);
            return kategori;
        }
    }

    public static String betygToTable(int betyg) {
        String tabel = "";
        if (betyg >= 0 && betyg <= 9) {
            tabel = "00" + Integer.toString(betyg);
        } else if (betyg >= 10 && betyg <= 99) {
        tabel = "0"+Integer.toString(betyg);
        }else if (betyg==100){
            tabel=Integer.toString(betyg);}
        else{System.out.println("Något blev fel med betyg "+betyg);}
        return tabel;
    }
}
