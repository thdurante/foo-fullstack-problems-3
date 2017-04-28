package br.ufg.inf.ex7;

import java.util.ArrayList;

public class Candidato {

    private String numeroInscricao;
    private String nome;
    private String telefone;
    private double nota;
    private ArrayList<Resposta> respostas;

    public Candidato(String numeroInscricao, String nome, String telefone) {
        this.numeroInscricao = numeroInscricao;
        this.nome = nome;
        this.telefone = telefone;
        this.respostas = new ArrayList<>();
    }

    public String getNumeroInscricao() {
        return this.numeroInscricao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public boolean isAprovado() {
        return this.nota >= Prova.NOTA_MINIMA;
    }

    public ArrayList<Resposta> getRespostas() {
        return this.respostas;
    }

    public double getNota() {
        return this.nota;
    }

    public void adicionaResposta(Resposta resposta) {
        this.respostas.add(resposta);
    }

    public void setNota(Prova prova) {
        int nota = 0;

        for (Resposta resposta : this.respostas) {
            Questao questao = prova.buscaQuestaoPeloIdentificador(resposta.getQuestao().getIdentificador());
            if (resposta.getQuestao().getIdentificador().equalsIgnoreCase(questao.getIdentificador())) {
                if (questao.getResposta().equalsIgnoreCase(resposta.getValor())) {
                    nota++;
                }
            }
        }

        this.nota = nota;
    }
}
