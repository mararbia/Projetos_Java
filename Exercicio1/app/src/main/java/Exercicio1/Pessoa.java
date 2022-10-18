/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Mara
 */
public class Pessoa {
    
    private String nome;   
    private String dataNascimento;
    private float altura;

    public Pessoa() {
    }    
        
    public void imprimirDados(){
        System.out.println("Nome: " + nome + "\nData de Nascimento: " 
                + dataNascimento + "\nAltura: " + altura + "m");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
