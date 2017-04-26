package br.ufg.inf.ex5;

public class Comerciario {

    private int numeroInscricao;
    private int televisoesTelaPlanaVendidas;
    private int televisoesTelaComumVendidas;
    private double salarioFixo;
    private double salarioBruto;
    private double salarioLiquido;

    public Comerciario(int numeroInscricao, int televisoesTelaPlanaVendidas, int televisoesTelaComumVendidas, double salarioFixo) {
        this.numeroInscricao = numeroInscricao;
        this.televisoesTelaPlanaVendidas = televisoesTelaPlanaVendidas;
        this.televisoesTelaComumVendidas = televisoesTelaComumVendidas;
        this.salarioFixo = salarioFixo;
    }

    public void setSalarioBruto() {
        double comissaoTelaPlana;
        double comissaoTelaComum;

        if (this.televisoesTelaPlanaVendidas >= 10) {
            comissaoTelaPlana = this.televisoesTelaPlanaVendidas * 50;
        } else {
            comissaoTelaPlana = this.televisoesTelaPlanaVendidas * 30;
        }

        if (this.televisoesTelaComumVendidas >= 20) {
            comissaoTelaComum = this.televisoesTelaComumVendidas * 30;
        } else {
            comissaoTelaComum = this.televisoesTelaComumVendidas * 20;
        }

        this.salarioBruto = this.salarioFixo + comissaoTelaPlana + comissaoTelaComum;
    }

    public void setSalarioLiquido() {
        if ((this.salarioBruto * 0.92) >= 700) {
            this.salarioLiquido = this.salarioBruto * 0.87;
        } else {
            this.salarioLiquido = this.salarioBruto * 0.92;
        }
    }

    public int getNumeroInscricao() {
        return this.numeroInscricao;
    }

    public int getTelevisoesTelaPlanaVendidas() {
        return this.televisoesTelaPlanaVendidas;
    }

    public int getTelevisoesTelaComumVendidas() {
        return this.televisoesTelaComumVendidas;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public double getSalarioLiquido() {
        return this.salarioLiquido;
    }
}
