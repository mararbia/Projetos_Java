/*
    Escreva um algoritmo para determinar o consumo médio de um automóvel 
    sendo fornecida a distância total percorrida pelo automóvel e o 
    total de combustível gasto;
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
        
        System.out.println("Consumo médio: " + consMedio);
    }
}
