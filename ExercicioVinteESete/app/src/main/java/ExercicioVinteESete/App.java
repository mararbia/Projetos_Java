/*
    A concessionária de veículos “CARANGO” está vendendo os seus veículos 
    com desconto. Faça um algoritmo que calcule e exiba o valor do desconto 
    e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre 
    o valor do veículo de acordo com o combustível (álcool – 25%, 
    gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra 
    entrada de dados. Informe total de desconto e total pago pelos clientes;
 */
package ExercicioVinteESete;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float valorVeiculo;
        float valorFinal;
        int opcao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do veículo: ");
        valorVeiculo = scanner.nextFloat();

        while (valorVeiculo != 0) {

            System.out.println("Escolha o tipo de combustível: ");
            System.out.println("1 - Álcool");
            System.out.println("2 - Gasolina");
            System.out.println("3 - Diesel");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    valorFinal = valorVeiculo - (valorVeiculo * 0.25f);
                    System.out.println("Total a ser pago pelo cliente é de: "
                            + "R$" + valorFinal);
                }
                case 2 -> {
                    valorFinal = valorVeiculo - (valorVeiculo * 0.21f);
                    System.out.println("Total a ser pago pelo cliente é de: "
                            + "R$" + valorFinal);
                }
                case 3 -> {
                    valorFinal = valorVeiculo - (valorVeiculo * 0.14f);
                    System.out.println("Total a ser pago pelo cliente é de: "
                            + "R$" + valorFinal);
                }
                default -> System.out.println("Opção Inválida!");
            }
            
            System.out.println("\n\nPara continuar digite o VALOR DO "
                    + "VEÍCULO ou 0 para sair: ");
            valorVeiculo = scanner.nextFloat();
        }
    }
}
