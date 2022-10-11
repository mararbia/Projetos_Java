package Classes;

/**
 *
 * @author Mara
 */
public class Pessoa {
    
    //Atributos
    float peso;
    float altura;
    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
