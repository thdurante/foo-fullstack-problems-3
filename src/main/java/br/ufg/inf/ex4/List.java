package br.ufg.inf.ex4;

import br.ufg.inf.ex3.Cidade;

import java.util.ArrayList;

public class List {

    private int tamanhoMaximo;
    private ArrayList<Cidade> cidades;

    public List(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.cidades = new ArrayList<>(this.tamanhoMaximo);
    }

    public void adiciona(Cidade cidade) {
        if (this.cidades.size() < this.tamanhoMaximo) {
            this.cidades.add(cidade);
        }
    }

    public void remove(int posicao) {
        if (this.cidades.size() > posicao && posicao >= 0) {
            this.cidades.remove(posicao);
        }
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }
}
