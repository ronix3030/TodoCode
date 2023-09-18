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
public class Ejercicio3TodoCode {
    
    public static void main(String[] args) {
        
    
    Scanner teclado=new Scanner(System.in);
    //declarar la altura del arbol
    
    int altura=10;
    
    //bucle para recorrer todas las filas(altura)
        for (int fila = 0; fila < altura; fila++) {
        
        
        //bucle para los espacios 
        for (int espacio=0; espacio<(altura-fila-1);espacio++){
            /*  4-0-1=3
                4-1-1=2
                4-2-1=1
                4-3-1=0
            */
            
            System.out.print(" ");
        }
        //bucle para los asteriscos
        
        
        for(int asterisco=0; asterisco<(fila*2)+1;asterisco++){
            
            System.out.print("*");
        }
        //este es un espacio de linea
            System.out.println("");
}
        
        //bucle del tronco
        
        int largoTronco=1;
        for(int base=0;base<largoTronco;base++){
         // espacios en blanco
        for(int espacio=0;espacio<(altura-2);espacio++){
            System.out.print(" ");
            
        }
        //barritas tronco
        for (int tronco = 0; tronco < 3; tronco++) {
            System.out.print("|");
            
        }
        //este es un espacio de linea
        System.out.println("");
    
    }
        
        
    }
}
