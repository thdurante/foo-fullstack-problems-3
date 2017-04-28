package br.ufg.inf.ex7;

public class Resposta {

    private String valor;
    private Questao questao;
    private Candidato candidato;

    public Resposta(String valor, Questao questao, Candidato candidato) {
        this.valor = valor;
        this.questao = questao;
        this.candidato = candidato;
    }

    public String getValor() {
        return valor;
    }

    public Questao getQuestao() {
        return questao;
    }

    public Candidato getCandidato() {
        return candidato;
    }
}
