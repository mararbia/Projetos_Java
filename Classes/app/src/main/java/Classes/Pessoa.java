package Classes;

/**
 *
 * @author Mara
 */
public class Pessoa {
    
    //Atributos com modificador de acesso
    private float peso;
    private float altura;
    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    
    //Método construtor - OPCIONAL
    //Passa valores DEFAULT
    public Pessoa(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
            
    //Métodos Acessores
    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
