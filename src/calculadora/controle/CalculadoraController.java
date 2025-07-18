
package calculadora.controle;

import calculadora.enums.EnumOperacao;


public class CalculadoraController {
    private double total;
    
    
    public CalculadoraController() {
        total = 0.0;
    }
    public Double realizaOperacao(EnumOperacao operacao, Double valor) {
        if (valor == null || operacao == null) {
            return total;
        }
        switch (operacao) {
            case SOMA -> total += valor;
            case SUBTRACAO -> total -= valor;
            case MULTIPLICAO -> total *= valor;
            case DIVISAO -> {
                if (valor == 0) {
                    System.out.println("Erro: divisão por zero.");
                    return total;
                }
                total /= valor;
            }
        }
        return total;
    }
    
    public Double getTotal() {
        return this.total;
    }
    
    public void zerar() {
        total = 0.0;
    }
}
