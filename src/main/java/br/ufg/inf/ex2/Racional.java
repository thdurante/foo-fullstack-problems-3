package br.ufg.inf.ex2;

public class Racional {

    private int numerador;
    private int denominador;

    public Racional(String fracao) throws NumberFormatException {
        this.numerador = Integer.parseInt(fracao.split("/")[0]);
        this.denominador = Integer.parseInt(fracao.split("/")[1]);
    }

    public Racional() {
        this.numerador = 1;
        this.denominador = 2;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    private int minimoMultiploComum(int n1, int n2) {
        int resto, a, b;

        a = n1;
        b = n2;

        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);

        return ( n1 * n2) / a;
    }

    public Racional soma(Racional r) {
        return new Racional(this.numerador + r.numerador, this.minimoMultiploComum(this.denominador, r.denominador));
    }

    public Racional subtrai(Racional r) {
        return new Racional(this.numerador - r.numerador, this.minimoMultiploComum(this.denominador, r.denominador));
    }

    public Racional multiplica(Racional r) {
        return new Racional(this.numerador * r.numerador, this.denominador * r.denominador);
    }

    public Racional divide(Racional r) {
        return new Racional(this.numerador * r.denominador, this.denominador * r.numerador);
    }

    public String mostra() {
        return this.numerador + "/" + this.denominador;
    }
}
