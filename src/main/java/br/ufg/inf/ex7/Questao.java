package br.ufg.inf.ex7;

public class Questao {

    private String identificador;
    private String enunciado;
    private String resposta;

    public Questao(String identificador, String enunciado, String resposta) {
        this.identificador = identificador;
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getResposta() {
        return resposta;
    }
}
