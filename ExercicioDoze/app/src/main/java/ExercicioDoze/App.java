/*
    O custo de um carro novo ao consumidor é a soma do custo de fábrica 
    mais o percentual do distribuidor e dos impostos aplicados (primeiro 
    os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
    do distribuidor sobre o resultado). Supondo que o percentual do 
    distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que leia 
    o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
 */
package ExercicioDoze;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float custoFabrica = 0.0f;
        float percentualDistribuido = 0.0f;
        float impostos = 0.0f;
        float valorFinal = 0.0f;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Custo de fábrica: ");
        custoFabrica = scanner.nextFloat();
        System.out.println("Percentual do distribuidor: ");
        percentualDistribuido = scanner.nextFloat() / 100;
        System.out.println("Impostos: ");
        impostos = scanner.nextFloat() / 100;
        
        valorFinal = (custoFabrica * percentualDistribuido) + 
                (custoFabrica * impostos) + custoFabrica;
        
        System.out.println("Valor do veículo a custo de fábrica: R$ " + valorFinal);
    }
}
