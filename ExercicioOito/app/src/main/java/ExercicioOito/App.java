/*
    Elabore um algoritmo que efetue a apresentação do valor da conversão em real 
    (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor 
    da cotação do dólar e também a quantidade de dólares disponíveis com o
    usuário;
 */
package ExercicioOito;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float quantidadeDolar = 0.0f;
        float valorReal = 0.0f;
        float cotacaoDolar = 0.0f;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantidade de dolar: ");
        quantidadeDolar = scanner.nextFloat();
        System.out.println("Cotação dolar: ");
        cotacaoDolar = scanner.nextFloat();
        
        valorReal = quantidadeDolar / cotacaoDolar;
        
        System.out.println("Valor convertido em R$: " + valorReal);
                        
    }
}
