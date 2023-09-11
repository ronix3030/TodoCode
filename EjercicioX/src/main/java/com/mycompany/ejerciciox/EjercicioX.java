/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciox;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class EjercicioX {

    public static void main(String[] args) {
        // aca definimos el obj que se llama entrada y que este funciona como escaner
         Scanner entrada= new Scanner(System.in);
         
         int c; // creamos una variable para que almacene el dato ingresado
         
        System.out.println("Seleccione Categoria 1=repositor 2=cajero 3=supervisor");
        
        c=entrada.nextInt();
        
         
        if (c==1) {
            double r;
            r=15890*0.10;
             System.out.println("Selecciono Repositor");
            System.out.println("Uste cobra $15.890 + 10% que es un total de $"+(r+15890));
            
        } else if(c==2){
            System.out.println("Selecciono Cajero");
            System.out.println("Usted cobra $25.630,89 ");
            
        }
        else if(c==3){
            double r;
            r=3556089 *0.11;
            
              System.out.println("Selecciono Supervisor");
              System.out.println("Usted cobra con un descuento de jubilacion de 11% total es $" + (3556020-r));
            
        }
        else{
            System.err.println("Numero invalido");
        }
    }
}
