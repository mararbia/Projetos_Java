/*
    Escreva um algoritmo que leia o nome e as três notas obtidas por 
    um aluno durante o semestre. Calcular a sua média (aritmética), 
    informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) 
    e Recuperação (media entre 5.1 a 6.9);
 */
package ExercicioDezesseis;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String nome;
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        float media = 0.0f;
              
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do aluno: ");
        nome = scanner.nextLine();
        
        System.out.println("Nota prova 1: ");
        nota1 = scanner.nextFloat();
        
        System.out.println("Nota prova 2: ");
        nota2 = scanner.nextFloat();
        
        System.out.println("Nota prova 3: ");
        nota3 = scanner.nextFloat();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if( media >= 7){
            System.out.println("Aluno: " + nome + " -- Aprovado!");
        } else if (media <= 5){
            System.out.println("Aluno: " + nome + " -- Reprovado!");
        }else if (media >= 5.1 || media <= 6.9){
            System.out.println("Aluno: " + nome + " -- Recuperação!");
        }
    }
}
