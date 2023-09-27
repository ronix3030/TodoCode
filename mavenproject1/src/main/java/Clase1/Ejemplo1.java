/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase1;

import java.util.Scanner;

/**
 *
 * @author Roni
 */
public class Ejemplo1 {
    
     public static void main(String[] args) {
    
    
      Scanner teclado =new Scanner(System.in);
        
        double horasTra,tarifaho;
        double sueldoBas, montoBoni, sueldoBru, montoDesc, sueldoNet;
        
        
        System.out.println("Ingrese las horas trabajadas");
        horasTra=teclado.nextDouble();
        System.out.println("Ingrese la tarifa");
        tarifaho=teclado.nextDouble();
        
        
        sueldoBas=horasTra*tarifaho;
        montoBoni=sueldoBas*0.20;
        sueldoBru=sueldoBas+montoBoni;
        montoDesc=sueldoBru*0.10;
        sueldoNet=sueldoBru-montoDesc;
      
        System.out.println("Syeldi basico $" + sueldoBas);
        System.out.println("Bonificacion $" + montoBoni);
        System.out.println("Sueldo Bruto $" + sueldoBru);
        System.out.println("Descuentos $" + montoDesc);
        System.out.println("Sueldo Neto $" +sueldoNet);
        
        
        
        
        
    }
    
}

    

