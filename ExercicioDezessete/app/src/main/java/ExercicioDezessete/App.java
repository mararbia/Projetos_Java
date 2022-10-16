/*
    Leia 80 números e ao final informar quantos número(s) est(á)ão no 
    intervalo entre 10 (inclusive) e 150 (inclusive);
 */
package ExercicioDezessete;

import java.util.Scanner;


public class App {
    
    public static void main(String[] args) {
        
        int numero;
        int contador = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            
            if(numero >= 10 && numero <= 150){
                contador++;
            }
        }
        
        System.out.println(contador + " número(s) est(á)ão entre 10 e 150");
    }
}
