/*
    Escreva um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo 
    e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que 
    este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar 
    o seu nome, o sal�rio fixo e sal�rio no final do m�s;
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
        System.out.println("Sal�rio fixo: ");
        salFixo = scanner.nextDouble();
        System.out.println("Total de vendas efetuadas: ");
        vendasEfetuadas = scanner.nextDouble();
        
        comissao = vendasEfetuadas * 0.15;
        
        salFinal = comissao + salFixo;
        
        System.out.println("Nome: " + nome + "\nSal�rio Fixo: " + salFixo + "\nSal�rio Final: " + salFinal);
    }
}
