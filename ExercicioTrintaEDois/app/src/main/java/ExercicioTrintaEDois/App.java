/*
    Escreva um algoritmo que leia três valores inteiros e verifique se 
    eles podem ser os lados de um triângulo. Se forem, informar qual o 
    tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
    Propriedade: o comprimento de cada lado de um triângulo é menor do 
    que a soma dos comprimentos dos outros dois lados.
    a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados 
    iguais;
    b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
    c. Triângulo equilátero é também isóscele;
    d. Triângulo Escaleno: aquele que tem os comprimentos de seus três 
    lados diferentes;
 */
package ExercicioTrintaEDois;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int lado1, lado2, lado3;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        lado1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        lado2 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        lado3 = scanner.nextInt();
        
        if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado1 + lado2)){
            System.out.println("Não é um triângulo!");
        } else if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("Triângulo Equilátero!");
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            System.out.println("Triângulo Isósceles!");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}
