/*
    Faça um algoritmo que receba o preço de custo de um produto e mostre 
    o valor de venda. Sabe-se que o preço de custo receberá um acréscimo 
    de acordo com um percentual informado pelo usuário;
 */
package ExercicioOnze;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float precoCusto = 0.0f;
        float valorVenda = 0.0f;
        float percentual = 0.0f;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Preço de custo: ");
        precoCusto = scanner.nextFloat();
        
        System.out.println("Percentual de acrécimo: ");
        percentual = scanner.nextFloat() / 100;
        
        valorVenda = (precoCusto * percentual) + precoCusto;
        
        System.out.println("Valor de venda: " + valorVenda);
        
        
    }
}
