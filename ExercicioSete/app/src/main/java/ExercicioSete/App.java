/*
    Leia uma temperatura em graus Celsius e apresentá-la convertida em graus 
    Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura 
    em Fahrenheit e C a temperatura emCelsius;
 */
package ExercicioSete;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float graus;
        float grausConvertido;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em graus Celsius: ");
        graus = scanner.nextFloat();
        
        grausConvertido = (9 * graus + 160) / 5;
        
        System.out.println("A temperatura em Fahreneheit é: " + grausConvertido);
                
    }
}
