package com.logica.funciones;

public class Funciones {
       
    public static void conteo(int num){
        if(num <= 10){
            System.out.println("Conteo: " + num);
            conteo(num + 1);
        }
    }

}
