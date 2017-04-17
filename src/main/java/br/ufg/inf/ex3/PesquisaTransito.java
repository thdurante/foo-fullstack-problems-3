package br.ufg.inf.ex3;

import java.util.ArrayList;
import java.util.List;

public class PesquisaTransito {

    private List<Cidade> cidades;

    public PesquisaTransito() {
        this.cidades = new ArrayList<>();
    }

    public void inicializaPesquisa() {
        this.cidades.add(new Cidade(
            1,
            "Goiânia",
            "GO",
            14569,
            98
        ));

        this.cidades.add(new Cidade(
            2,
            "Anápolis",
            "GO",
            4590,
            120
        ));

        this.cidades.add(new Cidade(
            3,
            "São Paulo",
            "SP",
            241309,
            20945
        ));

        this.cidades.add(new Cidade(
            4,
            "Rio de Janeiro",
            "RJ",
            220458,
            13902
        ));

        this.cidades.add(new Cidade(
            5,
            "Aparecida de Goiânia",
            "GO",
            8743,
            20
        ));
    }

    public Cidade getCidadeMaisAcidentesRegistrados() {
        int maxAcidentes = Integer.MIN_VALUE;
        Cidade cidadeMaxAcidentes = null;

        for (Cidade c: cidades) {
            if (c.getAcidentes() > maxAcidentes) {
                maxAcidentes = c.getAcidentes();
                cidadeMaxAcidentes = c;
            }
        }

        return cidadeMaxAcidentes;
    }

    public Cidade getCidadeMenosAcidentesRegistrados() {
        int minAcidentes = Integer.MAX_VALUE;
        Cidade cidadeMinAcidentes = null;

        for (Cidade c: cidades) {
            if (c.getAcidentes() < minAcidentes) {
                minAcidentes = c.getAcidentes();
                cidadeMinAcidentes = c;
            }
        }

        return cidadeMinAcidentes;
    }

    public double mediaVeiculos() {
        int veiculos = 0;
        for (Cidade c: this.cidades) veiculos += c.getVeiculos();

        return (double) veiculos / this.cidades.size();
    }

    public double mediaAcidentes(String estado) {
        int acidentes = 0;
        int cidades = 0;

        for (Cidade c: this.cidades) {
            if (c.getEstado().equals(estado)) {
                acidentes += c.getAcidentes();
                cidades++;
            }
        }

        return (double) acidentes / cidades;
    }
}
