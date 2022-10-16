/*
    Escreva um algoritmo que leia os dados de “N” pessoas 
    (nome, sexo, idade e saúde) e informe se está apta ou não para 
    cumprir o serviço militar obrigatório. Informe os totais;
 */
package ExercicioVinteEUm;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String nome;
        char sexo, saude;
        int idade, qtd, total;
        char continuar = 'S';
        int mulher = 0;
        int homem = 0;

        Scanner scanner = new Scanner(System.in);

        while (continuar == 'S' || continuar == 's') {
            System.out.println("Infoem os seguintes dados: ");
            System.out.println("Nome: ");
            nome = scanner.next();
            System.out.println("Sexo: F - Feminino / M - Masculino");
            sexo = scanner.next().charAt(0);
            System.out.println("Idade: ");
            idade = scanner.nextInt();
            System.out.println("Estado de saúde: B - Boa / R - Ruim");
            saude = scanner.next().charAt(0);

            if (sexo == 'f' || sexo == 'F') {
                
                if ((idade >= 17 && idade <= 24)&& (saude == 'b' || saude == 'B')){
                    System.out.println("Apta\n\n");
                    mulher++;   
                }else {
                    System.out.println("Inapta\n\n");
                }                          
            }else if (sexo == 'm' || sexo == 'M'){
                if ((idade >= 17 && idade <= 22) && (saude == 'b' || saude == 'B')){
                    System.out.println("Apto\n\n");
                    homem++;
                }else {
                    System.out.println("Inapto\n\n");
                }                
            }
            System.out.println("Deseja continuar? S - Sim / N - Não ");;
            continuar = scanner.next().charAt(0);
        }
        System.out.println("\n\n" + mulher + " mulher(es) está(ão) apta(s)");
        System.out.println(homem + " homem(ns) está(ão) apto(s)");
        
        total = mulher + homem;
        
        System.out.println("\n\nTotal de pessoas aptas " + total);
    }
}
