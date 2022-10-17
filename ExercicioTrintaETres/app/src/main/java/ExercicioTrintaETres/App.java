/*
    A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
    Faça um algoritmo que calcule e exiba o salário de um professor. 
    Sabe-se que o valor da hora/aula segue a tabela abaixo:
    a. Professor Nível 1 R$12,00 por hora/aula;
    b. Professor Nível 2 R$17,00 por hora/aula;
    c. Professor Nível 3 R$25,00 por hora/aula.
 */
package ExercicioTrintaETres;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float horas, salario;
        int nivel;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de horas: ");
        horas = scanner.nextFloat();
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Nível 1");
        System.out.println("2 - Nível 2");
        System.out.println("3 - Nível 3");
        nivel = scanner.nextInt();
        
        
        switch(nivel){
            case 1 -> {
                salario = horas * 12;
                System.out.println("Salário: R$ " + salario);
            }
            case 2 -> {
                salario = horas * 17;
                System.out.println("Salário: R$ " + salario);
            }
            case 3 -> {
                salario = horas * 25;
                System.out.println("Salário: R$ " + salario);
            }
            default -> System.out.println("Opção Inválida!");
        }
    }
}
