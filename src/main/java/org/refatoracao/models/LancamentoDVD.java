package org.refatoracao.models;

public class LancamentoDVD extends DVD {
    public LancamentoDVD(String título) {
        super(título);
    }

    @Override
    public CalculadoraPreco getCalculadoraPreco() {
        return new PrecoLancamento();
    }
}