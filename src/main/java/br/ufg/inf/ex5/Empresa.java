package br.ufg.inf.ex5;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Comerciario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>(35);
    }

    public void contrataComerciario(Comerciario comerciario) {
        this.funcionarios.add(comerciario);
    }

    public ArrayList<Comerciario> getFuncionarios() {
        return this.funcionarios;
    }
}
