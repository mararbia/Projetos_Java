/*
    Faça um algoritmo que receba o preço de custo e o preço de venda de 40 
    produtos. Mostre como resultado se houve lucro, prejuízo ou empate para 
    cada produto. Informe o valor de custo de cada produto, o valor de venda 
    de cada produto, a média de preço de custo e do preço de venda;
 */
package ExercicioVinteEDois;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String nomeProduto;
        float precoCusto, precoVenda;      
        float totalVenda = 0.0f;
        float totalCusto = 0.0f;
        
        int i = 0;        
        for (; i < 3; i++) {
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = scanner.next();
            
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = scanner.nextFloat();
            
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = scanner.nextFloat();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if (precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e "
                        + "o de venda");
            }else{
                if(precoCusto > precoVenda){
                    System.out.println("Prejuízo");
                }else{
                    System.out.println("Lucro");
                }
            }
            System.out.println(nomeProduto + ", preço de custo " + precoCusto + 
                   " preço de venda " + precoVenda);
        }
        System.out.println("A média do preço de custo é de: " + totalCusto / i);
        System.out.println("A média do preço de venda é de: " + totalVenda / i);
    }
}
