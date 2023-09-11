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
public class otro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a, b;
        int o;

        System.out.println("Ingrese que operacion Desea Realizar Suma=1 Resta=2 Multiplacion=3 Division=4");
        o = teclado.nextInt();
        System.out.println("Ingrese Numero");
        a = teclado.nextDouble();
        System.out.println("Ingrese 2do Numero");
        b = teclado.nextDouble();
        if (a == 1) {
            System.out.println("La Suma es: " + (a + b));

        } else if (o == 2) {
            System.out.println("La resta es: " + (a - b));
        } else if (o == 3) {
            System.out.println("La Multiplicacion es: " + (a * b));
        } else if (o == 4) {
            if (a > b) {

                System.out.println("La division es: " + (a / b));
            }
            if (b > a) {
                System.out.println("Numero Imposible Dividir");
            }
        } else {
            System.err.println("Numero Invalido ");
        }

    }

}
