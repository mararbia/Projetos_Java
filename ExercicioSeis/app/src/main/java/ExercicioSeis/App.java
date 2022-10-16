/*
    Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores 
    de forma que a variável A passe a possuir o valor da variável B e a variável 
    B passe a possuir o valor da variável A.Apresentar osvalores trocados;
 */
package ExercicioSeis;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        
        int a;
        int b;
        int aux;
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Digite o valor de A: ");
        a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextInt();
        
        aux = a;
        a = b;
        b = aux;
        
        System.out.println("Valores trocados: A = " + a + " B = " + b);
               
    }
}
