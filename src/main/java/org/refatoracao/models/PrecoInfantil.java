package org.refatoracao.models;

public class PrecoInfantil implements CalculadoraPreco {
    @Override
    public double calcularPreco(int diasAlugado) {
        double preco = 1.5;
        if (diasAlugado > 3) {
            preco += (diasAlugado - 3) * 1.5;
        }
        return preco;
    }
}
