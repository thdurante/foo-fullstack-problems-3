package br.ufg.inf.ex3;

public class Cidade {

    private int codigo;
    private String nome;
    private String estado;
    private int veiculos;
    private int acidentes;

    public Cidade() {

    }

    public Cidade(int codigo, String nome, String estado, int veiculos, int acidentes) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
        this.veiculos = veiculos;
        this.acidentes = acidentes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public int getVeiculos() {
        return veiculos;
    }

    public int getAcidentes() {
        return acidentes;
    }
}
