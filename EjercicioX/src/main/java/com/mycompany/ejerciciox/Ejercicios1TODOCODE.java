/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciox;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class Ejercicios1TODOCODE {
     public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         
         int a;
         int b=1;
         System.out.println("Ingrese Numero a recorrer");
         a=teclado.nextInt();
         
         while (b <=a) {

             System.out.println(b);
             
            b=b+1;             
             
         }
          
         

        String pa; // Declarar la variable para almacenar la palabra
        
        System.out.println("Ingrese palabra:"); // Solicitar al usuario que ingrese una palabra
        pa = teclado.nextLine(); // Leer la palabra ingresada por el usuario
        
        // El bucle while se ejecutará mientras la palabra ingresada NO sea igual a "salir"
        while (!pa.equals("salir")) { // El operador "!" significa "no" en este contexto, por lo que "!pa.equals("salir")" significa "mientras pa NO sea igual a 'salir'"
            // Leer la siguiente palabra ingresada por el usuario
            pa = teclado.nextLine();
            
            System.out.println("Ingrese palabra:"); // Volver a solicitar al usuario que ingrese otra palabra
        }
        
        // El bucle se detendrá cuando el usuario ingrese la palabra "salir"
        
        // Cerrar el Scanner después de su uso
        teclado.close();
    }
}


        
        
         
         
         
     
