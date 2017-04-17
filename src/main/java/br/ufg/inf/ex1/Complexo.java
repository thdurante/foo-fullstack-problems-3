package br.ufg.inf.ex1;

public class Complexo {

    private float parteReal;
    private float parteImaginaria;

    public Complexo(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complexo() {
        this.parteReal = 3;
        this.parteImaginaria = 7;
    }

    public float soma(Complexo c) {
        return (float) ((this.parteReal + c.parteReal) + (this.parteImaginaria + c.parteImaginaria) * Math.sqrt(-1));
    }

    public float subtrai(Complexo c) {
        return (float) ((this.parteReal - c.parteReal) + (this.parteImaginaria - c.parteImaginaria) * Math.sqrt(-1));
    }

    public String mostra() {
        return "(" + this.parteReal + ", " + this.parteImaginaria + ")";
    }
}
