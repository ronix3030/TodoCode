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
public class Swich {
    public static void main(String[] args) {
        // aca definimos el obj que se llama entrada y que este funciona como escaner
         Scanner entrada= new Scanner(System.in);
     
         
       
         int a,b,c;
         System.out.println("Ingrese opcion Multi=1 Resta=2 Division=3");
         a=entrada.nextInt();
         System.out.println("Ingrese Numero 1");
         b=entrada.nextInt();
         System.out.println("Ingrese Numero 2" );
         c=entrada.nextInt();
         
         switch (a) {
            case 1: System.out.println("La Multiplicacion es: "+ (b*c));;
                break;
                
                case 2:
                    
                    System.out.println("La Resta es: " +(b-c));
                 break;
                 
                 case 3:
                     if (b>c) {
                          System.out.println("La division es: " + (b/c));;
                     } else {
                         System.out.println("EL numero 1 tiene que ser mayor a 2");
                     }
                   
                 break;
                 
            default:
                System.out.println("Numero Incorrecto");
        }
         
     
         
         
         
    }
    
}
