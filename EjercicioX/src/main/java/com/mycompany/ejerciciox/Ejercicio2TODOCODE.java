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
public class Ejercicio2TODOCODE {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Ingrese dni");
        String dni = teclado.nextLine();
        System.out.println("Ingrese Nombre");
        String nom = teclado.nextLine();
        System.out.println("Ingrese su Edad");
        int edad = teclado2.nextInt();

         // Comenzamos un bucle que se ejecutará mientras se cumplan ambas condiciones:
        // 1. La variable "dni" no sea igual a "0".
        // 2. La variable "nom" no sea igual a "fin" (sin importar mayúsculas/minúsculas).
        while (!dni.equals("0") && !nom.equalsIgnoreCase("fin")) 
        {
            if (edad == 6 || edad <= 10) {
                System.out.println("Usted es de categoria Menores A");
            } else if (edad == 11 || edad <= 17) {
                System.out.println("Usted es de categoria Menores B");

            } else if (edad == 18 || edad <= 30) {
                System.out.println("Usted es de categoria Juveniles");
            } else if (edad == 31 || edad <= 50) {
                System.out.println("Usted es de categoria Adultos");
            }
            else if(edad>50){
                System.out.println("Usted es Adulto Mayor");
            }
            else {
                System.out.println("Error");
            }
            break;
      

        }
        System.out.println("Programa terminado.");// Salimos del bucle después de una sola iteración.
        
    }

}

