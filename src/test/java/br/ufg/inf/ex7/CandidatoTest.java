package br.ufg.inf.ex7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandidatoTest {

    private Candidato candidato;

    @Before
    public void setUp() {
        candidato = new Candidato("123", "Candidato", "99999-9999");
    }

    @Test
    public void isAprovadoRetornaTrueQuandoNotaMaiorIgualSeis() {
        Prova prova = getProvaValida();

        for (int i = 0; i < 10; i++) {
            Resposta resposta = new Resposta(i + "", prova.getGabarito().get(i), candidato);
            candidato.adicionaResposta(resposta);
        }

        candidato.setNota(prova);

        assertTrue(candidato.isAprovado());
        assertEquals(10, candidato.getNota(), 0);
    }

    @Test
    public void isAprovadoRetornaFalseQuandoNotaMenorSeis() {
        Prova prova = getProvaValida();
        Resposta resposta = getResposta("999", prova.getGabarito().get(0));
        candidato.adicionaResposta(resposta);
        candidato.setNota(prova);

        assertFalse(candidato.isAprovado());
        assertEquals(0, candidato.getNota(), 0);
    }

    @Test
    public void adicionaRespostaFuncionaCorretamente() {
        Questao questao = new Questao("123", "Qual o valor de X?", "1");
        Resposta resposta = getResposta("1", questao);
        candidato.adicionaResposta(resposta);

        assertEquals(1, candidato.getRespostas().size());
    }

    private Prova getProvaValida() {
        Prova prova = new Prova();
        prova.adicionaCandidato(candidato);

        for (int i = 0; i < 10; i++) {
            Questao questao = new Questao(i + "", "Qual é o valor de " + i + " ?", i + "");
            prova.adicionaQuestaoAoGabarito(questao);
        }

        return prova;
    }

    private Resposta getResposta(String valor, Questao questao) {
        return new Resposta(valor, questao, candidato);
    }
}