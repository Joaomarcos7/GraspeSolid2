package org.refatoracao.models;

abstract class DVD {
    protected String título;

    public DVD(String título) {
        this.título = título;
    }

    public abstract CalculadoraPreco getCalculadoraPreco();

    public String getTítulo() {
        return título;
    }
}
