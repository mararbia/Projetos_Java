/*
    Fa�a um algoritmo que receba dois n�meros e ao final mostre a soma, 
    subtra��o, multiplica��o e a divis�o dos dois n�meros lidos;
 */
package ExercicioDois;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int num1, num2, soma, sub, mult, div;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um n�mero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro n�mero: ");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("O Resultado da soma �: " + soma + "\nO resultado da subtra��o �: " + sub 
                + "\nO resultado da multiplica��o �: " + mult + "\nO resultado da divis�o �: " + div
                );
        
    }
}
