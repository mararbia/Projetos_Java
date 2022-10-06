/*
    Faça um algoritmo que receba um número e diga se este número 
    está no intervalo entre 100 e 200;
 */
package ExercicioQuinze;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        int numero;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Está no intervalo");
        } else {
            System.out.println("Não está no intervalo");
        }
    }
}
