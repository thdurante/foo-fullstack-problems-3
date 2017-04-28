package br.ufg.inf.ex7;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProvaTest {

    private Prova prova;

    @Before
    public void setUp() {
        prova = getProvaValida();
    }

    @Test
    public void adicionaCandidatoFuncionaCorretamente() {
        Candidato candidato = getCandidato("123", "Candidato", "99999-9999");
        prova.adicionaCandidato(candidato);

        assertEquals(1, prova.getCandidatos().size());
    }

    @Test
    public void adicionaQuestaoAoGabaritoFuncionaCorretamente() {
        Questao questao = getQuestao("123", "Qual o valor de X?", "1");
        prova.adicionaQuestaoAoGabarito(questao);

        assertEquals(11, prova.getGabarito().size());
    }

    @Test
    public void buscaCandidatoPeloNumeroInscricaoRetornaCandidatoQuandoEncontrado() {
        Candidato candidato = getCandidato("123", "Candidato", "99999-9999");
        prova.adicionaCandidato(candidato);

        assertEquals(candidato, prova.buscaCandidatoPeloNumeroInscricao("123"));
    }

    @Test
    public void buscaCandidatoPeloNumeroInscricaoRetornaNullQuandoNaoEncontrado() {
        Candidato candidato = getCandidato("123", "Candidato", "99999-9999");
        prova.adicionaCandidato(candidato);

        assertNull(prova.buscaCandidatoPeloNumeroInscricao("999"));
    }

    @Test
    public void buscaQuestaoPeloIdentificadorRetornaQuestaoQuandoEncontrada() {
        Questao questao = getQuestao("123", "Qual o valor de X?", "1");
        prova.adicionaQuestaoAoGabarito(questao);

        assertEquals(questao, prova.buscaQuestaoPeloIdentificador("123"));
    }

    @Test
    public void buscaQuestaoPeloIdentificadorRetornaNullQuandoNaoEncontradada() {
        Questao questao = getQuestao("123", "Qual o valor de X?", "1");
        prova.adicionaQuestaoAoGabarito(questao);

        assertNull(prova.buscaQuestaoPeloIdentificador("999"));
    }

    @Test
    public void calculaNotaCandidatosFuncionaCorretamente() {
        Candidato reprovado = getCandidato("456", "Reprovado", "99999-9999");

        prova.calculaNotaCandidatos();

        assertFalse(reprovado.isAprovado());
    }

    @Test
    public void getPorcentagemAprovadosFuncionaCorretamente() {
        Candidato aprovado = getCandidatoAprovado("123", "Aprovado", "99999-9999");
        Candidato reprovado = getCandidatoReprovado("456", "Reprovado", "99999-9999");

        assertTrue(aprovado.isAprovado());
        assertFalse(reprovado.isAprovado());
        assertEquals(50, prova.getPorcentagemAprovados(), 0);
    }

    @Test
    public void getPorcentagemNotaMaiorIgualNoveFuncionaCorretamente() {
        Candidato aprovado = getCandidatoAprovado("123", "Aprovado", "99999-9999");
        Candidato reprovado = getCandidatoReprovado("456", "Reprovado", "99999-9999");

        assertTrue(aprovado.isAprovado());
        assertFalse(reprovado.isAprovado());
        assertEquals(50, prova.getPorcentagemNotaMaiorIgualNove(), 0);
    }

    @Test
    public void getCandidatosAprovadosFuncionaCorretamente() {
        ArrayList<Candidato> aprovados = new ArrayList<>();
        aprovados.add(getCandidatoAprovado("123", "Aprovado1", "99999-9999"));
        aprovados.add(getCandidatoAprovado("456", "Aprovado2", "99999-9999"));

        assertEquals(aprovados, prova.getCandidatosAprovados());
    }

    private Prova getProvaValida() {
        prova = new Prova();

        for (int i = 0; i < 10; i++) {
            Questao questao = new Questao(i + "", "Qual é o valor de " + i + " ?", i + "");
            prova.adicionaQuestaoAoGabarito(questao);
        }

        return prova;
    }

    private Candidato getCandidato(String numeroInscricao, String nome, String telefone) {
        return new Candidato(numeroInscricao, nome, telefone);
    }

    private Questao getQuestao(String identificador, String enunciado, String resposta) {
        return new Questao(identificador, enunciado, resposta);
    }

    private Candidato getCandidatoAprovado(String numeroInscricao, String nome, String telefone) {
        Candidato aprovado = getCandidato(numeroInscricao, nome, telefone);

        prova.adicionaCandidato(aprovado);

        for (int i = 0; i < 10; i++) {
            Resposta resposta = new Resposta(i + "", prova.getGabarito().get(i), aprovado);
            aprovado.adicionaResposta(resposta);
        }

        aprovado.setNota(prova);

        return aprovado;
    }

    private Candidato getCandidatoReprovado(String numeroInscricao, String nome, String telefone) {
        Candidato reprovado = getCandidato(numeroInscricao, nome, telefone);

        prova.adicionaCandidato(reprovado);

        Resposta respostaIncorreta = new Resposta("999", prova.getGabarito().get(0), reprovado);
        reprovado.adicionaResposta(respostaIncorreta);

        reprovado.setNota(prova);

        return reprovado;
    }
}