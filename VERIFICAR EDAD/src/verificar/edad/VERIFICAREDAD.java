/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificar.edad;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class VERIFICAREDAD {
    public static boolean puedeVotar(int edad) {
        return edad >= 18;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        boolean resultado = puedeVotar(edad);

        if (resultado) {
            System.out.println("La persona PUEDE votar.");
        } else {
            System.out.println("La persona NO puede votar.");
        
        }
    }
}
     

