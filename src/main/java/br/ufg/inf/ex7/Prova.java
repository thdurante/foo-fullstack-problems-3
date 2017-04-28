package br.ufg.inf.ex7;

import java.util.ArrayList;

public class Prova {

    public static final double NOTA_MINIMA = 6;
    private ArrayList<Candidato> candidatos;
    private ArrayList<Questao> gabarito;

    public Prova() {
        this.candidatos = new ArrayList<>();
        this.gabarito = new ArrayList<>();
    }

    public ArrayList<Candidato> getCandidatos() {
        return this.candidatos;
    }

    public ArrayList<Questao> getGabarito() {
        return this.gabarito;
    }

    public void adicionaCandidato(Candidato candidato) {
        this.candidatos.add(candidato);
    }

    public void adicionaQuestaoAoGabarito(Questao questao) {
        this.gabarito.add(questao);
    }

    public Candidato buscaCandidatoPeloNumeroInscricao(String numeroInscricao) {
        Candidato candidatoEncontrado = null;

        for (Candidato candidato : this.candidatos) {
            if (candidato.getNumeroInscricao().equalsIgnoreCase(numeroInscricao)) {
                candidatoEncontrado = candidato;
            }
        }

        return candidatoEncontrado;
    }

    public Questao buscaQuestaoPeloIdentificador(String identificador) {
        Questao questaoEncontrada = null;

        for (Questao questao : this.gabarito) {
            if (questao.getIdentificador().equalsIgnoreCase(identificador)) {
                questaoEncontrada = questao;
            }
        }

        return questaoEncontrada;
    }

    public void calculaNotaCandidatos() {
        for (Candidato candidato : this.candidatos) {
            candidato.setNota(this);
        }
    }

    public double getPorcentagemAprovados() {
        double totalCandidatos = this.candidatos.size();
        double totalAprovados = 0;

        for (Candidato candidato : this.candidatos) {
            if (candidato.isAprovado()) {
                totalAprovados++;
            }
        }

        return (totalAprovados / totalCandidatos) * 100;
    }

    public double getPorcentagemNotaMaiorIgualNove() {
        double totalCandidatos = this.candidatos.size();
        double totalNotaMaiorIgualNove = 0;

        for (Candidato candidato : this.candidatos) {
            if (candidato.getNota() >= 9) {
                totalNotaMaiorIgualNove++;
            }
        }

        return (totalNotaMaiorIgualNove / totalCandidatos) * 100;
    }

    public ArrayList<Candidato> getCandidatosAprovados() {
        ArrayList<Candidato> aprovados = new ArrayList<>();

        for (Candidato candidato : this.candidatos) {
            if (candidato.isAprovado()) {
                aprovados.add(candidato);
            }
        }

        return aprovados;
    }
}
