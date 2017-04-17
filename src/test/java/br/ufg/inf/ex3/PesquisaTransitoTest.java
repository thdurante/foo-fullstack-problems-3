package br.ufg.inf.ex3;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PesquisaTransitoTest {

    private PesquisaTransito pesquisa;

    @Before
    public void setUp() {
        this.pesquisa = new PesquisaTransito();
        this.pesquisa.inicializaPesquisa();
    }

    @Test
    public void cidadeMaisAcidentesRegistrados() {
        assertEquals(3, this.pesquisa.getCidadeMaisAcidentesRegistrados().getCodigo());
        assertEquals("São Paulo", this.pesquisa.getCidadeMaisAcidentesRegistrados().getNome());
    }

    @Test
    public void cidadeMenosAcidentesRegistrados() {
        assertEquals(5, this.pesquisa.getCidadeMenosAcidentesRegistrados().getCodigo());
        assertEquals("Aparecida de Goiânia", this.pesquisa.getCidadeMenosAcidentesRegistrados().getNome());
    }

    @Test
    public void mediaVeiculos() {
        assertEquals(97933.8, this.pesquisa.mediaVeiculos(), 0);
    }

    @Test
    public void mediaAcidentesEstado() {
        assertEquals(79.33333333333333, this.pesquisa.mediaAcidentes("GO"), 0);
    }
}
