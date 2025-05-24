package iteraciones;
import java.util.Arrays;
import java.util.List;

import com.logica.funciones.Funciones;


/*
 * EJERCICIO:
 * Utilizando tu lenguaje, emplea 3 mecanismos diferentes para imprimir
 * números del 1 al 10 mediante iteración.
 *
 * DIFICULTAD EXTRA (opcional):
 * Escribe el mayor número de mecanismos que posea tu lenguaje
 * para iterar valores. ¿Eres capaz de utilizar 5? ¿Y 10?
 */

public final class Main {    
    
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("********************* EXTRA *******************");
        System.out.println();

        /* For */
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("For: " + i);            
        }

        /* While */
        int x =0;
        while(x <= 10){
            System.out.println("Do: " + x);
            x++;
        }
        
        /* Do-While */
        int i=0;
        do { i++;
            System.out.println("Do-While" + i);
        } while (i < 10 );

        /* For-each */
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (int numero : numeros) {
            System.out.println("For each: " + numero);            
        }

        Funciones.conteo(9);
    }    
}
