/*
    Escreva um algoritmo para determinar o consumo m�dio de um autom�vel 
    sendo fornecida a dist�ncia total percorrida pelo autom�vel e o 
    total de combust�vel gasto;
 */
package ExercicioTres;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        float consMedio, distPercorrida, totalGasto;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Distancia percorrida: ");
        distPercorrida = scanner.nextFloat();
        System.out.println("Total gasto: ");
        totalGasto = scanner.nextFloat();
        
        consMedio = distPercorrida / totalGasto;
        
        System.out.println("Consumo m�dio: " + consMedio);
    }
}
