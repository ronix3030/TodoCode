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
public class For {
      public static void main(String[] args) {
          Scanner teclado= new Scanner(System.in);
          
          int a;
          
          System.out.println("Ingrese Numero para Aumentar ");
          a=teclado.nextInt();
          
          for (;a < 100;a ++) {
              System.err.println(""+a);
              
          }
          
          
          
      }
    
}
