package br.ufg.inf.ex4;

import br.ufg.inf.ex3.Cidade;

public class TestaList {

    public static void main(String[] args) {
        List lista = new List(5);
        Cidade goiania = new Cidade(1, "Goiânia", "Goiás", 100, 5);
        Cidade aparecida = new Cidade(1, "Aparecida de Goiânia", "Goiás", 60, 2);

        lista.adiciona(goiania);
        lista.adiciona(aparecida);
        lista.remove(1);
    }
}
