/*
    Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe 
    o nome e se ela é homem ou mulher. No final informe total de homens 
    e de mulheres;
 */
package ExercicioDezenove;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        char sexo;
        int masculino = 0;
        int feminino = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o sexo: F - Feminino / M - Masculino");
            sexo = scanner.next().charAt(0);

            if (sexo == 'F' || sexo == 'f') {
                System.out.println("Sexo feminino");
                feminino++;
            } else if (sexo == 'M' || sexo == 'm') {
                System.out.println("Sexo masculino");
                masculino++;
            }
        }

        System.out.println(feminino + " é ou são mulhere(s) e " + masculino
                + " é ou são homen(s)");
    }
}
