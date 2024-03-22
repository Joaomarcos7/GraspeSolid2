package org.refatoracao.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        for (Aluguel aluguel : dvdsAlugados) {
            CalculadoraPreco calculadora = aluguel.getDVD().getCalculadoraPreco();
            double valorCorrente = calculadora.calcularPreco(aluguel.getDiasAlugado());

            // Tratamento de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            if (aluguel.getDVD() instanceof LancamentoDVD && aluguel.getDiasAlugado() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // Mostra valores para este aluguel
            resultado += "\t" + aluguel.getDVD().getTítulo() + "\t" + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        }

        // Adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Você acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";

        return resultado;
    }


    public String extratoHTML() {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        String resultado = "<H1>Registro de Alugueis de <EM>" + getNome() +
                "</EM></H1><P>" + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
// mostra valores para este aluguel

            resultado += cada.getDVD().getTítulo() + ": R$ " +

                    cada.getDVD().getCalculadoraPreco().calcularPreco(cada.getDiasAlugado()) + "<BR>"+ fimDeLinha;
        } // while
// adiciona rodapé
        resultado += "<P>Valor total pago: <EM>R$ " + getValorTotal() +
                "</EM>"+ fimDeLinha;
        resultado += "<P>Voce acumulou <EM>" +
                getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
        return resultado;
    }
}
