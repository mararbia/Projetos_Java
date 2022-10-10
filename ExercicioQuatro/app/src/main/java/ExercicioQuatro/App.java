/*
    Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo 
    e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que 
    este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar 
    o seu nome, o salário fixo e salário no final do mês;
 */
package ExercicioQuatro;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String nome;
        double salFixo, vendasEfetuadas, comissao, salFinal;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome: ");
        nome = scanner.nextLine();
        System.out.println("Salário fixo: ");
        salFixo = scanner.nextDouble();
        System.out.println("Total de vendas efetuadas: ");
        vendasEfetuadas = scanner.nextDouble();
        
        comissao = vendasEfetuadas * 0.15;
        
        salFinal = comissao + salFixo;
        
        System.out.println("Nome: " + nome + "\nSalário Fixo: " + salFixo + "\nSalário Final: " + salFinal);
    }
}
