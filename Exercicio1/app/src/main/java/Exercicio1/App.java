/*
    Crie uma classe para representar uma Pessoa com os atributos privados 
    de nome, data de nascimento e altura. Crie os métodos públicos necessários 
    para getters e setters e também um método para imprimir todos dados de 
    uma pessoa. Crie um método para calcular a idade da pessoa.
 */
package Exercicio1;

public class App {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mara");
        pessoa.setDataNascimento("06-09-1986");
        pessoa.setAltura(1.55f);
        
        pessoa.imprimirDados();       
        
    }
}
