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
public class time {
    public static String timar;
    public static String minuter;

    public static int timeToSec(int tim, int min) throws Exception {
        if (min >= 0 && tim >= 0) {
            int sek = min * 60 + tim * 3600;
            return sek;
        } else {
            throw new ArithmeticException("Måste vara minst 0");
        }
    }

    public static time secToTime(int sek) throws Exception{
time tid = new time();
int min = 0;
int tim = 0;

       if (sek >= 0) {            
                while (sek >= 60) {
                    sek -=  60;
                    min++;
                }
                if (min >= 60) {
                    while (min >= 60) {
                        min -= 60;
                        tim++;
                    }
                }
            }    
        else {
            throw new ArithmeticException("Måste vara minst 0 sekunder");
    }
        tid.minuter =Integer.toString(min);
        tid.timar = Integer.toString(tim);
                return tid;
}
    @Override 
    public String toString(){
    String tid = timar+":"+minuter;
    return tid;
    }
}
