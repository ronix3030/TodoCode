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
public class Vectores {
        public static void main(String[] args) {
            
            Scanner teclado=new Scanner(System.in);
            
            // declaracion
            
            int vector[] =new int [4];
            // asignacion
            
           
               
            //ingreso por teclado
            
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Ingrese numero para vector"+i);
                vector[i]=teclado.nextInt();
            }
               
               
               
          // recorrido
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Estoy en el indice"+i);
                System.out.println("Tengo guardado un" +vector[i]);
                System.out.println("-----------------");
                
                // se repite hasta que termine el recorrido osea
                // hasta que i sea igual a vector
            }
            
        }
    
}
