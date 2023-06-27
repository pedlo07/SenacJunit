package com.senac;

public class PositivoNegativo{
    public static String avalia(double x){
        if (x > 0){
            return "positivo";
        } else if (x < 0){
            return "negativo";
        } else {
           return "zero";
        }
    }
}
