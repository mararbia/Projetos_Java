/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ComandosLeituraGravacao;

import java.util.Scanner;

public class App {    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); // L� uma frase inteira at� q aperte o Enter
        String codigoRua = leitor.next(); // L� uma palavra
        
        System.out.println("Texto que ser� exibido no console"); // Exibe o texto e pula para a pr�xima linha
        System.out.print("Texto que ser� exibido no console"); // Exibe o texto e deixa o cursor no final da linha
    }
}
