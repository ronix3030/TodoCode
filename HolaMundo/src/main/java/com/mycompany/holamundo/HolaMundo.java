/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class HolaMundo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Hello World!");
        
        
        int r=2;
        int a=2;
        int number1;
        int number2;
        
        String nom="ronlad";
        double decim=2.341;
        boolean falso=false;
        long l=12566666;
        
        System.err.println("Suma" +a+r);
        System.err.println("Mi nombre es " +nom);
        System.err.println("Numero decimal "+decim);
        System.out.println("Este numero es " +falso);
        System.out.println("Este numero es de tipo de long "+1);
        
        int num1,num2,res;
        
        num1=10;
        num2=20;
        res=num1+num2;
        System.out.println("La suma es " + res);
        
        // ACA ESTOY INGRESANDO NUMERO CON EL SCANNER 
        
        
        System.out.println("Ingrese un numero");
        number1=entrada.nextInt();
        System.err.println("Ingre otro numero");
        number2=entrada.nextInt();
        System.out.println("La suma de lo Ingresado es " + (number1+number2));
        //Al colocar paréntesis alrededor de number1 + number2, le indicas a Java 
        //que realice primero la suma aritmética y luego convierta el resultado en 
        //una cadena para la salida
    }
 
    
}
