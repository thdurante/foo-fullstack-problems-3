package br.ufg.inf.ex7;

public class TestaCorrecaoProva {

    public static void main(String[] args) {
        Prova prova = new Prova();

        for (int i = 0; i < 10; i++) {
            Candidato candidato = new Candidato(i + "", "Candidato" + i, "919281" + i);
            prova.adicionaCandidato(candidato);
        }

        for (int i = 0; i < 10; i++) {
            Questao questao = new Questao(i + "", "Qual é o valor de " + i + " ?", i + "");
            prova.adicionaQuestaoAoGabarito(questao);
        }

        for (int i = 0; i < 10; i++) {
            String numeroInscricao = i + "";

            for (int j = 0; j < 10; j++) {
                String identificadorQuestao = j + "";
                Questao questao = prova.buscaQuestaoPeloIdentificador(identificadorQuestao);
                Candidato candidato = prova.buscaCandidatoPeloNumeroInscricao(numeroInscricao);
                Resposta resposta = new Resposta(j + "", questao, candidato);
                candidato.adicionaResposta(resposta);
            }
        }

        prova.calculaNotaCandidatos();

        System.out.println("\n\nRELAÇÃO GERAL DE CANDIDATOS\n");
        for (Candidato candidato : prova.getCandidatos()) {
            System.out.println("Candidato(a) " + candidato.getNome());
            System.out.println("\t\tNúmero de inscrição: " + candidato.getNumeroInscricao());
            System.out.println("\t\tNota: " + candidato.getNota());
            System.out.println("\t\tAprovado(a): " + (candidato.isAprovado() ? "Sim" : "Não"));
        }

        System.out.println("Porcentagem de candidatos aprovados: " + prova.getPorcentagemAprovados() + "%");

        System.out.println("\n\nRELAÇÃO DE CANDIDATOS APROVADOS\n");
        for (Candidato candidato : prova.getCandidatosAprovados()) {
            System.out.println("Candidato(a) " + candidato.getNome());
            System.out.println("\t\tNúmero de inscrição: " + candidato.getNumeroInscricao());
            System.out.println("\t\tTelefone: " + candidato.getTelefone());
        }

        System.out.println("Porcentagem de candidatos com nota maior ou igual à 9.0: " + prova.getPorcentagemNotaMaiorIgualNove());
    }
}
