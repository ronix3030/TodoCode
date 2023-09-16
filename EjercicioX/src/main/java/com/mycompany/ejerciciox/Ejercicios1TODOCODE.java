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
         
         String pa;
         System.out.println("Ingrese palabra");
         pa=teclado.nextLine();
         
        while (!pa.equals("salir")) {
    System.out.println(""+pa);
    pa = teclado.nextLine();
    System.out.println("Ingrese palabra"); // Ahora se imprime después de solicitar la nueva entrada
}
         
         
         
         
         
         
         
         
         
         
         
         
     }
    
}
