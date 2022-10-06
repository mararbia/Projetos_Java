/*
    Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
package ExercicioUm;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int soma;
        
        Scanner scanner = new Scanner(System.in);        
             
        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Digite um número: ");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("O resultado da soma é: " + soma);
    }
}
