/*
  Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
  que ele obteve no semestre. No final informar o nome do aluno e a sua média 
  (aritmética);
 */
package ExercicioCinco;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String nome;
        float notaProva1 = 0.0f;
        float notaProva2 = 0.0f;
        float notaProva3 = 0.0f;
        float media = 0.0f;
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Nome do aluno: ");
        nome = scanner.nextLine();
        System.out.println("Nota Prova 1: ");
        notaProva1 = scanner.nextFloat();
        System.out.println("Nota Prova 2: ");
        notaProva2 = scanner.nextFloat();
        System.out.println("Nota Prova 3: ");
        notaProva3 = scanner.nextFloat();
        
        media = (notaProva1 + notaProva2 + notaProva3) / 3;
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Sua média é: " + media);
        
    }
}
