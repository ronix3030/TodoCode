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
public class Ejercicio2 {
    
/*Escriba un programa que calcule el área total y el volumen de un cilindro.Considere 
las siguientes fórmulas: A = 2πr(r+h) y V = πr²h; siendo A el área, V el volumen,
r el radio y h la altura.
*/
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner teclado =new Scanner(System.in);
        
        double a,b,area,vo;
        
        System.out.println("Ingrese Radio");
        a=teclado.nextDouble();
        System.out.println("Ingrese Altura ");
        b=teclado.nextDouble();
        
        area=2*Math.PI*a*(a+b);
        vo=Math.PI*a*a*b;
        System.out.println("El area es: "+area);
        System.out.println("El volumen es: "+vo);
        
    }
    
}
