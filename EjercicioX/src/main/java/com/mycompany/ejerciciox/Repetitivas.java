/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciox;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class Repetitivas {
     public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         // Declaración e inicialización de una variable llamada "cont" con el valor 0.
         int  cont = 0;
         
         // Inicio de un bucle "while" que se ejecutará mientras la condición "cont <= 10" sea verdadera.
         while(cont <= 10){
             // Imprime el valor actual de "cont" en la consola.
             System.out.println("" + cont);
             
             // Incrementa el valor de "cont" en 1 en cada iteración.
             cont = cont + 1; // También se puede escribir como "cont++;" para incrementar en 1.
         }
         
         // El bucle se ejecutará hasta que "cont" sea mayor que 10.
         
         
         
         
          int a=0;
     
     while(a<=15){
            System.out.println(""+a);
            a=a+1;
     }     
     
     
     
     
     
         System.out.println("----------------Ejemplo Complejo-----------------------");
         Random rand = new Random();
        
        int numeroAdivinar = rand.nextInt(101); // Genera un número aleatorio entre 1 y 100
        int intentos = 0; // Inicializa el contador de intentos en 0
        int numero; // Variable para almacenar el número ingresado por el usuario

        System.out.println("Adivina el número (entre 1 y 100):");

        while (true) {
            numero = teclado.nextInt(); // Lee el número ingresado por el usuario
            intentos=intentos+1; // Incrementa el contador de intentos en 1

            if (numero < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor. Intento #" + intentos);
            } else if (numero > numeroAdivinar) {
                System.out.println("El número a adivinar es menor. Intento #" + intentos);
            }
            // este else vendria siendo el =al numero random    
            else {
                System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos.");
                break; // Sale del bucle cuando el número se adivina correctamente
            }
        }  
       
    
     
        int numero1=10;
        
        
        while(numero1>=1){
            System.out.println(""+numero1);
            numero1=numero1-1;
            
            
        }
        
         
        
     
     
     
     }

}
  
 

