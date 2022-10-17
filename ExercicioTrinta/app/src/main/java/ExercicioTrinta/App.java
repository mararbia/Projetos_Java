/*
    Escreva um algoritmo que leia três valores inteiros distintos e 
    os escreva em ordem crescente;
 */
package ExercicioTrinta;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int array[] = new int[3];
        array[0] = 10;
        array[1] = 5;
        array[2] = 2;

        int aux;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }

        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }       
    }    
}
