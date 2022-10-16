/*
    Faça um algoritmo que receba um valor que foi depositado e exiba o valor 
    com rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package ExercicioNove;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float valorDepositado = 0.0f;
        float valorRedimento = 0.0f;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor depositado: ");
        valorDepositado = scanner.nextFloat();
        
        valorRedimento = (valorDepositado * 0.07f) + valorDepositado;
        
        System.out.println("Valor com redimento: " + valorRedimento);
        
    }
}
