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
public class Ejercicio3 {
    
    
/*Débora, Raquel y Séfora aportan cantidades de dinero para formar un capital. Diseñe
un programa que determine el capital formado y el porcentaje de dicho capital que
aporta cada uno.*/

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner teclado=new Scanner(System.in);
        
        double a,b,c;
        
        System.out.println("Ingresa Debora");
        a=teclado.nextDouble();
        System.out.println("Ingresa Raquel");
        b=teclado.nextDouble();
        System.out.println("Ingresa Sefora");
        c=teclado.nextDouble();
        
        double r=a+b+c;
        System.out.println("Suma Total: " + r);
        
        //aca se determina el total del capital formado y luego calcular el porcentaje
        System.out.println("Pocentaje de Debora: " + (a/r)*100);
        System.out.println("Porcentaje de Raquel:"+ (a/r)*100);
        System.out.println("Porcentaje de Sefora:"+ (a/r)*100);
        
        
        
        
        
    }
    
}
