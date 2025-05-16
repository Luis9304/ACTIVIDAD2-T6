/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area.y.perimetro.de.circulo;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class AREAYPERIMETRODECIRCULO {
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);
        System.out.printf("Área del círculo: %.2f\n", area);
        System.out.printf("Perímetro del círculo: %.2f\n", perimetro);
     }
        
        
        
        
        
    }
    

