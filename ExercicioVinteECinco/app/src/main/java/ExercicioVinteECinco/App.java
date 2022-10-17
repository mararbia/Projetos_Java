/*
    Faça um algoritmo que leia dois números e identifique se são iguais 
    ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo 
    que eles são iguais. Caso sejam diferentes, informe qual número é o 
    maior, e uma mensagem que são diferentes;
 */
package ExercicioVinteECinco;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int num1, num2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();
        
        if(num1 == num2){
            System.out.println("São iguais!");
        }else if(num1 > num2){
            System.out.println(num1 + " é o maior número!");            
        }else if(num1 < num2){
            System.out.println(num2 + " é o maior número!");
        }else {
            System.out.println("São diferentes!");
        }
    }
}
