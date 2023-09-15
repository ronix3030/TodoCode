/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciox;

import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author Roni
 */
public class OperadorTernario {
     public static void main(String[] args) {
        // aca definimos el obj que se llama entrada y que este funciona como escaner
         Scanner entrada= new Scanner(System.in);
         
     
         double pro;
         String a;
         
         System.out.println("Ingrese Nota");
         pro=entrada.nextDouble();
         
         a=pro>=6 ?"Aprobadorto":"Desaprobado";
         System.out.println("Su nota es: "+ a);
         
         
         
         
         
     }
     
    
}
