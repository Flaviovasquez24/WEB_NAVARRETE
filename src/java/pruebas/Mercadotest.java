/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author FLAVIO
 */
public class Mercadotest {

  
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio por unidad del producto:");
        double precioPorUnidad = scanner.nextDouble();

        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = scanner.nextInt();

        double subtotal = precioPorUnidad * cantidad;
        double igv = subtotal * 0.18;  // Suponiendo un IGV del 18%
        double total = subtotal + igv;

        System.out.println("----- Detalles del Producto -----");
        System.out.println("Nombre: " + nombreProducto);
        System.out.println("Precio por Unidad: " + precioPorUnidad);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total a Pagar: " + total);
    }
    
}
