/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class PALINDROMO {
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replaceAll("\\s+", "");
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
        
    }
    
}
 