package br.ufg.inf.ex4;

import br.ufg.inf.ex3.Cidade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {

    private List lista;

    @Test
    public void adicionaDeveAdicionarCidadeCorretamente() {
        Cidade goiania = new Cidade(1, "Goiânia", "Goiás", 100, 5);
        lista = new List(1);
        lista.adiciona(goiania);

        assertEquals(goiania, lista.getCidades().get(0));
    }

    @Test
    public void adicionaNaoDeveAdicionarCidadeSeListaEstiverCheia() {
        Cidade goiania = new Cidade(1, "Goiânia", "Goiás", 100, 5);
        lista = new List(1);
        lista.adiciona(goiania);

        Cidade aparecida = new Cidade(1, "Aparecida de Goiânia", "Goiás", 60, 2);
        lista.adiciona(aparecida);

        assertEquals(1, lista.getCidades().size());
    }

    @Test
    public void removeDeveRemoverCidadeCorretamente() {
        Cidade goiania = new Cidade(1, "Goiânia", "Goiás", 100, 5);
        lista = new List(1);
        lista.adiciona(goiania);
        lista.remove(0);

        assertEquals(0, lista.getCidades().size());
    }

    @Test
    public void removeNaoDeveRemoverCidadeSeNaoExistirNaLista() {
        Cidade goiania = new Cidade(1, "Goiânia", "Goiás", 100, 5);
        lista = new List(1);
        lista.adiciona(goiania);
        lista.remove(1);

        assertEquals(1, lista.getCidades().size());
    }
}