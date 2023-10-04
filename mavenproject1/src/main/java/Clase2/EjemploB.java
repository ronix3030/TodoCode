/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author Roni
 */
public class EjemploB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado=new Scanner(System.in);
        
        int nota1=0;
        int nota2=0;
        int nota3=0;
        double promedio=0.0;
        
        System.out.println("Ingrese nota1");
        nota1=teclado.nextInt();
         System.out.println("Ingrese nota2");
         nota2=teclado.nextInt(); 
          System.out.println("Ingrese nota3");
          nota3=teclado.nextInt();
         
        
          if(nota3>=10)
              nota3=nota3+2;
          if(nota3>20)
              nota3=20;
          
          promedio=(nota1+nota2+nota3)/3;
          System.out.println("Promedio final:  "+ promedio);
          
        
        
    }
    
}
