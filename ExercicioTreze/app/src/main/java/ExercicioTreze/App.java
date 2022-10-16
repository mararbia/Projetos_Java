/*
    Faça um algoritmo que receba um número e mostre uma mensagem caso este 
    número seja maior que 10;
 */
package ExercicioTreze;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num = scanner.nextInt();
        
        if (num > 10){
            System.out.println("Número maior que 10");
        }       
    }
}
