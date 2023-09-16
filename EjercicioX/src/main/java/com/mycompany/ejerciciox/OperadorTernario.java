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
         
     //El operador ternario, es un operador en programación que permite tomar decisiones basadas en una condición y 
     //asignar un valor a una variable o expresión en función de si la condición es verdadera o falsa.

//Este operador se caracteriza por su sintaxis compacta y su capacidad para simplificar la escritura de condicionales 
//simples en una sola línea de código.
         double pro;
         String a;
         
         System.out.println("Ingrese Nota");
         pro=entrada.nextDouble();
         
         a=pro>=6 ?"Aprobadorto":"Desaprobado";
         System.out.println("Su nota es: "+ a);
         
         
         
         
         
     }
     
    
}
