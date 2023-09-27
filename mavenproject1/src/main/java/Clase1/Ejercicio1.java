/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Clase1;

import java.util.Scanner;

/**
 *
 * @author Roni
 */
public class Ejercicio1 {

/*Diseñe un programa que permita convertir una cantidad dada en metros a sus equivalentes 
en centímetros, pulgadas, pies y yardas. Considere la siguiente información:
1 metro = 100 centímetros
1 pie = 12 pulgadas
1 yarda = 3 pies
1 pulgada = 2.54 centímetros
*/

    public static void main(String[] args) {
        
        // aca cree un objeto que se llama teclado
        Scanner teclado=new Scanner(System.in);
        
        
        double r;
       
        
        System.out.println("Ingrese los metros a convertir");
        r=teclado.nextDouble();
        
        System.out.println("Resultado en centimetros " + (r*100));
        System.out.println("Resultado en pulgadas " +(r*39.37));
        System.out.println("Resultado en pies "+ (r*3.28));
        System.out.println("Resultado en yardas " +(r*1.0936));
        
    }
}
