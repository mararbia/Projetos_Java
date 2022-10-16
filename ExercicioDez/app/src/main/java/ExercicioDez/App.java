/*
    A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações 
    sem juros. Faça um algoritmo que receba um valor de uma compra e mostre 
    o valor das prestações;
 */
package ExercicioDez;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float valorProduto = 0.0f;
        float valorPrestacoes = 0.0f;
                
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor do produto: ");
        valorProduto = scanner.nextFloat();
        
        valorPrestacoes = valorProduto / 5;
        
        System.out.println("Prestações: 5 x " + valorPrestacoes);
    }
}
