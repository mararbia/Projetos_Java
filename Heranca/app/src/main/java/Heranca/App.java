package Heranca;

import java.util.Date;

public class App {
    
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Mara");
        v.setSalario(1000.0f);
        v.setCpf("00000000090");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salário do vendedor é: " + v.calcularSalario());
        
        Motorista m = new Motorista();
    }
}
