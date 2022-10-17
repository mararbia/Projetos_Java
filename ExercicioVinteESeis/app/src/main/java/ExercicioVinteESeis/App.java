/*
    Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. 
    Caso o usuário digite um número que não esteja neste intervalo, exibir 
    a seguinte mensagem: número inválido;
 */
package ExercicioVinteESeis;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int opcao;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        opcao = scanner.nextInt();

        switch (opcao) {

            case 1 -> System.out.println("Um");
            case 2 -> System.out.println("Dois");
            case 3 -> System.out.println("Três");
            case 4 -> System.out.println("Quatro");
            case 5 -> System.out.println("Cinco");
            default -> System.out.println("Número inválido");
        }
    }
}
