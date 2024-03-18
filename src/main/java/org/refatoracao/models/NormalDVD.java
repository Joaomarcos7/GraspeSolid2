package org.refatoracao.models;

public class NormalDVD extends DVD {
    public NormalDVD(String título) {
        super(título);
    }

    @Override
    public CalculadoraPreco getCalculadoraPreco() {
        return new PrecoNormal();
    }
}

