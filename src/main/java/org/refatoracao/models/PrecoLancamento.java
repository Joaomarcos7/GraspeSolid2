package org.refatoracao.models;

public class PrecoLancamento implements CalculadoraPreco{
    @Override
    public double calcularPreco(int diasAlugado){
            return diasAlugado * 3.0;
    }
}
