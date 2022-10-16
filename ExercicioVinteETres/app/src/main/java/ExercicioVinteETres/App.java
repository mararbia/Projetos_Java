/*
    Faça um algoritmo que receba um número e mostre uma mensagem caso 
    este número seja maior que 80, menor que 25 ou igual a 40;
 */
package ExercicioVinteETres;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num = scanner.nextInt();
        
        if((num > 80) || (num < 25) || (num == 40)){
            System.out.println("O número pode ser maior que 80, menor "
                    + "que 25 ou igual a 40");
        }
    }
}
