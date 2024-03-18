package org.refatoracao.models;

public class InfantilDVD extends DVD {
    public InfantilDVD(String título) {
        super(título);
    }

    @Override
    public CalculadoraPreco getCalculadoraPreco() {
        return new PrecoInfantil();
    }
}
