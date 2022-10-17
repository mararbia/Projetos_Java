/*
    Escreva um algoritmo para uma empresa que decide dar um reajuste a 
    seus 584 funcionários de acordo com os seguintes critérios:
    a. 50% para aqueles que ganham menos do que três salários mínimos;
    b. 20% para aqueles que ganham entre três até dez salários mínimos;
    c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
    d. 10% para os demais funcionários.

    Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
    Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
    o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar 
    sua folha de pagamento;
 */
package ExercicioVinteEOito;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        String nome;
        float salario;
        float salarioMinimo;
        float calculoReajuste = 0.0f;
        float salarioReajustado;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe os seguintes dados: ");
        System.out.println("Nome do funcionário: ");
        nome = scanner.nextLine();
        System.out.println("Valor do salário: ");
        salario = scanner.nextFloat();
        System.out.println("Valor do salário mínimo: ");
        salarioMinimo = scanner.nextFloat();
        
        if (salario < salarioMinimo * 3){
            salarioReajustado = (salario * 0.5f) + salario;
            System.out.println("Nome: " + nome + "\nReajuste: 50%" + "\nNovo Salário: " + salarioReajustado);
        }else if ((salario >= salarioMinimo * 3) && (salario <= salarioMinimo * 10)){
            salarioReajustado = (salario * 0.2f) + salario;
            System.out.println("Nome: " + nome + "\nReajuste: 20%" + "\nNovo Salário: " + salarioReajustado);
        }else if ((salario >= salarioMinimo * 10) && (salario <= salarioMinimo * 20)){
            salarioReajustado = (salario * 0.15f) + salario;
            System.out.println("Nome: " + nome + "\nReajuste: 15%" + "\nNovo Salário: " + salarioReajustado);            
        }else {
            salarioReajustado = (salario * 0.1f) + salario;
            System.out.println("Nome: " + nome + "\nReajuste: 10%" + "\nNovo Salário: " + salarioReajustado);
        }
        
    }
}
