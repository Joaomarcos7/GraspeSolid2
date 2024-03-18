package org.refatoracao;
import org.refatoracao.models.*;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");
        c1.adicionaAluguel(new Aluguel(new NormalDVD("O Atirador"), 10));
        c1.adicionaAluguel(new Aluguel(new InfantilDVD("Luca"), 2));
        c1.adicionaAluguel(new Aluguel(new LancamentoDVD("O Gato de Botas 2"), 30));
        c1.adicionaAluguel(new Aluguel(new LancamentoDVD("Arremessando Alto"), 4));
        c1.adicionaAluguel(new Aluguel(new InfantilDVD("Moana"), 10));
        c1.adicionaAluguel(new Aluguel(new NormalDVD("Uma Noite no Museu"), 3));

        System.out.println(c1.extrato());
    }
}