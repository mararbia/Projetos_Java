/*
    Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
    Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
    Tipo de Cliente Valor do KW/h
    a. (Residência) 0,60;
    b. (Comércio) 0,48;
    c. (Indústria) 1,29.
 */
package ExercicioTrintaECinco;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float horas, valorTotal;
        int tipo;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de horas: ");
        horas = scanner.nextFloat();
        
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        tipo = scanner.nextInt();
        
        switch(tipo){
            case 1 -> {
                valorTotal = horas * 0.60f;
                System.out.println("Total da conta: R$ " + valorTotal);                
            }
            case 2 -> {
                valorTotal = horas * 0.48f;
                System.out.println("Total da conta: R$ " + valorTotal);                
            }
            case 3 -> {
                valorTotal = horas * 1.29f;
                System.out.println("Total da conta: R$ " + valorTotal);                
            }
            default -> System.out.println("Opção Inválida");
        }
        
    }
}
