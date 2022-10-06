/*
    Faça um algoritmo que receba dois números e ao final mostre a soma, 
    subtração, multiplicação e a divisão dos dois números lidos;
 */
package ExercicioDois;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int num1, num2, soma, sub, mult, div;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("O Resultado da soma é: " + soma + "\nO resultado da subtração é: " + sub 
                + "\nO resultado da multiplicação é: " + mult + "\nO resultado da divisão é: " + div
                );
        
    }
}
