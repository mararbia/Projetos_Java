/*
    Fa�a um algoritmo que receba �N� n�meros e mostre positivo, negativo ou 
    zero para cada n�mero;
 */
package ExercicioVinteEQuatro;

import java.util.Scanner;

public class App {
           
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            System.out.println("Digite um n�mero: ");
            int numero = scanner.nextInt();
            
            if (numero == 0){
                System.out.println("O n�mero � zero");
            }else {
                if(numero > 0){
                    System.out.println("O n�mero � positivo");
                }else {
                    System.out.println("O n�mero � negativo");
                }                    
            }
            
            System.out.println("Deseja continuar? S - Sim / N - N�o");
            desejaContinuar = scanner.next().charAt(0);
        }
        
        
    }
}
