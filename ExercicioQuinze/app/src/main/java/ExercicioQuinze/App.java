/*
    Fa�a um algoritmo que receba um n�mero e diga se este n�mero 
    est� no intervalo entre 100 e 200;
 */
package ExercicioQuinze;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        int numero;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um n�mero: ");
        numero = scanner.nextInt();
        
        if(numero >= 100 && numero <= 200){
            System.out.println("Est� no intervalo");
        } else {
            System.out.println("N�o est� no intervalo");
        }
    }
}
