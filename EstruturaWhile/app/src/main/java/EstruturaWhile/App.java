/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package EstruturaWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int totalAlunos = 2;

        Scanner scanner = new Scanner(System.in);

        while (totalAlunos > 0) {
            
            System.out.println("Nome do(a) aluno(a): ");
            String nomeAluno = scanner.nextLine();
            System.out.println("Idade do(a) aluno(a): ");
            int idadeAluno = scanner.nextInt();

            System.out.println("O nome do aluno � : " + nomeAluno + "e sua "
                    + "idade �: " + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
        }
    }
}
