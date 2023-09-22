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
public class Matrices {
    public static void main(String[] args) {
        
        Scanner teclado =new Scanner(System.in);
        
        
        //declaracion
        int matriz [][]= new int [3][3];
        
        //asignacion manual
        matriz[0][0] =28;
         matriz[0][1] =57;
          matriz[0][2] =58;
          
            matriz[1][0] =21;
         matriz[1][1] =64;
          matriz[1][2] =48;
         
          matriz[2][0] =78;
         matriz[2][1] =98;
          matriz[2][2] =545;
          
          for (int i = 0; i < matriz.length; i++) {
              System.out.println(""+matriz);
            
        }
          
        
        
        
    }
    
}
