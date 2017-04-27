package br.ufg.inf.ex6;

import java.util.ArrayList;

public class Fabrica {

    private ArrayList<Operario> funcionarios;

    public Fabrica() {
        this.funcionarios = new ArrayList<>();
    }

    public ArrayList<Operario> getFuncionarios() {
        return this.funcionarios;
    }

    public void contrataOperario(Operario operario) {
        this.funcionarios.add(operario);
    }

    public double getTotalFolhaPagamento() {
        double total = 0;

        for (Operario operario : this.funcionarios) {
            total += operario.getSalario();
        }

        return total;
    }

    public int getTotalPecasFabricadas() {
        int total = 0;

        for (Operario operario : this.funcionarios) {
            total += operario.getNumeroPecasFabricadas();
        }

        return total;
    }

    public double getMediaPecasHomensCategoriaA() {
        int numeroPecasFabricadas = 0;
        int numeroHomens = 0;

        for (Operario operario : this.funcionarios) {
            if (operario.getCategoria() == 'A' && operario.getSexo() == 'M') {
                numeroPecasFabricadas += operario.getNumeroPecasFabricadas();
                numeroHomens++;
            }
        }

        if (numeroPecasFabricadas == 0) {
            return 0;
        }

        return numeroPecasFabricadas / numeroHomens;
    }

    public double getMediaPecasMulheresCategoriaC() {
        int numeroPecasFabricadas = 0;
        int numeroMulheres = 0;

        for (Operario operario : this.funcionarios) {
            if (operario.getCategoria() == 'C' && operario.getSexo() == 'F') {
                numeroPecasFabricadas += operario.getNumeroPecasFabricadas();
                numeroMulheres++;
            }
        }

        if (numeroPecasFabricadas == 0) {
            return 0;
        }

        return numeroPecasFabricadas / numeroMulheres;
    }

    public Operario getOperarioMaiorSalario() {
        Operario operarioMaiorSalario = null;
        double maiorSalario = 0;

        for (Operario operario : this.funcionarios) {
            if (operario.getSalario() > maiorSalario) {
                maiorSalario = operario.getSalario();
                operarioMaiorSalario = operario;
            }
        }

        return operarioMaiorSalario;
    }
}
