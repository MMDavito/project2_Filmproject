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
    public static String toFirstCap(String ord){
        String stBokstav = ord.substring(0,1).toUpperCase();
        String stOrd = stBokstav + ord.substring(1);
        return stOrd;
    }
    public static String genreIntToString(int genre){
        String genreNummer = "";
    }
          switch ((genre)) {
              case: 1
                      genreNummer = Action;
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
            default:
    }
    
}
