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

    public static int timeToSec (int tim, int min)throws Exception{
    if(min>=0 && tim>=0){
    int sek = min*60 + tim*3600;
    return sek;
    }
    else throw new ArithmeticException("Måste vara minst 0");
    }
    
    /*
    public static int secToTime(int sek) {
        if (min >= 0 && tim >= 0) {
        int sek;
        
            if (min % 60 == 0) {
                 
                sek = min * 60;
            } else if (min % 60 != 0) {
                int rest;
                int temp
                        = rest = min % 60;
                temp = min - rest;
                sek =temp
                        
                        
                        
                        
                        
            if (tim > 0) {
                int timSek = 0;
                timSek = tim * 3600;
                timSek += min
                return timSek;
            }}
        } else {
            throw IllegalArgumentException;
        }*/
    }
