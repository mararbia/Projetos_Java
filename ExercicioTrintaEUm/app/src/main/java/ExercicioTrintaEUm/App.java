/*
    Dados três valores A, B e C, em que A e B são números reais e C 
    é um caractere, pede-se para imprimir o resultado da operação de 
    A por B se C for um símbolo de operador aritmético; caso contrário 
    deve ser impressa uma mensagem de operador não definido. Tratar erro 
    de divisão por zero;
 */
package ExercicioTrintaEUm;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        float a, b, resultado;
        char c;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        a = scanner.nextFloat();
        System.out.println("Digite outro valor: ");
        b = scanner.nextFloat();
        
        System.out.println("Escolha a operação matemática: ");
        System.out.println("+ - Soma");
        System.out.println("- Subtração");
        System.out.println("x - Multiplicação");
        System.out.println("/ - Divisão");
        c = scanner.next().charAt(0);
        
        switch (c) {
            case '+':
                resultado = a + b;
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case 'x':
            case 'X':
                resultado = a * b;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            default:
                if ((c == '/') && (a != 0) && (b != 0)){
                    resultado = a / b;
                    System.out.println("O resultado da divisão é: " + resultado);
                }else if ((a == 0) || (b == 0)){
                    System.out.println("Erro ao efetuar uma divisão por zero!");
                }   break;
        }
    }
}
