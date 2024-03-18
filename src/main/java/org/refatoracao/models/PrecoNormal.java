package org.refatoracao.models;

public class PrecoNormal implements CalculadoraPreco{
    @Override
    public double calcularPreco(int diasAlugado){
        double preco = 2.0;
        if (diasAlugado > 2) {
            preco += (diasAlugado - 2) * 1.5;
        }
        return preco;
    }
}
