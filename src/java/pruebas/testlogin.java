/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author FLAVIO
 */
public class testlogin {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese Usuario");
        String Usua = scanner.nextLine();
        System.out.println("Ingrese Contraseña");
        String Contra = scanner.nextLine();
          String vcon = ".*\\d.*";

        
      if (!Usua.matches(vcon)) {
          System.out.println("correo erroneo");
} else if (!Contra.matches(vcon)) {
          System.out.println("contraseña erronea");
} else {
          System.out.println("bienvenido al sistema");
    }
    
    }
}
