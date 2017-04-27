package br.ufg.inf.ex6;

public class Operario {

    private String matricula;
    private int numeroPecasFabricadas;
    private char sexo;
    private char categoria;
    private double salario;
    private static final double SALARIO_MINIMO = 937;

    public Operario(String matricula, int numeroPecasFabricadas, char sexo) {
        this.matricula = matricula;
        this.numeroPecasFabricadas = numeroPecasFabricadas;
        this.sexo = sexo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getNumeroPecasFabricadas() {
        return this.numeroPecasFabricadas;
    }

    public int getCategoria() {
        return this.categoria;
    }

    public int getSexo() {
        return this.sexo;
    }

    public void setCategoria() {
        if (this.numeroPecasFabricadas <= 10) {
            this.categoria = 'A';
        } else if (this.numeroPecasFabricadas >= 11 && this.numeroPecasFabricadas <= 35) {
            this.categoria = 'B';
        } else if (this.numeroPecasFabricadas > 35) {
            this.categoria = 'C';
        }
    }

    public void setSalario() {
        if (categoria == 'A') {
            this.salario = SALARIO_MINIMO;
        } else if (categoria == 'B') {
            int numeroPecasComissao = this.numeroPecasFabricadas - 10;
            double comissao = SALARIO_MINIMO * 0.05;
            this.salario = SALARIO_MINIMO + (comissao * numeroPecasComissao);
        } else if (categoria == 'C') {
            int numeroPecasComissao = this.numeroPecasFabricadas - 35;
            double comissao = SALARIO_MINIMO * 0.09;
            this.salario = SALARIO_MINIMO + (comissao * numeroPecasComissao);
        }
    }
}
