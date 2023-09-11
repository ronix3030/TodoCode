/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hola2;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class HOLA2 {

    // REALIZAR UN PROGRAMA QUE PERMITA EL INTERCAMBIO DE VALORES ENTRE 2 VARIABLES
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Hello World!");
        int num1=50;
        int num2=20;
        int aux;
    
        System.err.println("----Antes---");
        System.out.println("NUM1 "+num1);
        System.out.println("NUM2 "+num2);
        System.out.println("-----Despues----");
        
        aux=num1; 
        // aux vale ahora 50
        num1=num2;
        // num1 vale ahora 20
        num2=aux;
        // num2 vale ahora 50
        
        
        System.out.println("NUM1 "+num1);
        System.out.println("NUM2 "+num2);
        
        int hola =20;
        int hola2=20;
        
        if (hola<hola2) {
            System.out.println("10 es menor o igual a 20");
        }
        else if (hola==hola2){
                    System.err.println("Numeros iguales");
                
        }
        else{
            System.out.println("hola seria mayor a hola 2 ");
        }
        
        int dia=1;
        String diaN;
        int numberDia;
        
          System.err.println("Ingrese numero del dia ");
          numberDia=entrada.nextInt();
          
          
        switch (numberDia) {
            
            case 1: diaN="Lunes";
                break;
                
                  case 2: diaN="Martes";;
                      break;
                      
                  case 3: diaN="Miercoles";
                      break;
                      
                  case 4: diaN="Jueves";;
                      break;
            default:
                throw new AssertionError();
        }
       
        System.err.println("Dia seleccionado "+ diaN);
      
        
    }
    
    
   
   
}
