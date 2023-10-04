/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase2;

import java.util.Scanner;

/**
 *
 * @author Roni
 */
public class EjemploA {
     public static void main(String[] args) {
         
         /*
         Una tienda vende un producto a precios unitarios que dependen de la cantidad de
unidades adquiridas de acuerdo con la siguiente tabla:
Adicionalmente, si el cliente adquiere más de 50 unidades la tienda le descuenta el
15% del importe de la compra; en caso contrario, sólo le descuenta el 5%.
Diseñe un programa que determine el importe de la compra, el importe del descuento
y el importe a pagar por la compra de cierta cantidad de unidades del producto.

         */
         Scanner teclado=new Scanner(System.in);
         
         int unidades=0;
         double precioUnitario=0.0;
         double importeCompra=0.0;
         double descuento=0.0;
         double importePago=0.0;
         System.out.println("Ingrese Unidades");
         unidades=teclado.nextInt();
         
         if ((unidades >=1) && (unidades <=25))
             precioUnitario=27.7;
         else
             if((unidades>=26) && (unidades<=50))
                 precioUnitario=25.5;
             else if((unidades >=51) && (unidades <=75))
                 precioUnitario=23.5;
             else if(unidades >=76)
                 precioUnitario=21.5;
         
         importeCompra =unidades * precioUnitario;
         
         if(unidades >=50)
             descuento =0.15*importeCompra;
         else 
             descuento=0.05*importeCompra;
         
         
         importePago=importeCompra-descuento;
         
         System.out.println("El importe de la compra es: "+ importeCompra);
         System.out.println("El importe de descuento es: "+descuento);
         System.out.println("El importe a pagar"+importePago);
         
         
     }
    
}
