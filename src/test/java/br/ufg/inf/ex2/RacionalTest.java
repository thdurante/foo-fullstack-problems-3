package br.ufg.inf.ex2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RacionalTest {

    private Racional r1;
    private Racional r2;
    private Racional r3;
    private Racional r4;

    @Before
    public void setUp() {
        this.r1 = new Racional("3/4");
        this.r2 = new Racional("1/5");
        this.r3 = new Racional();
        this.r4 = new Racional("1/4");
    }

    @Test(expected = NumberFormatException.class)
    public void construtorInvalido() {
        new Racional("qualquer coisa que não representa uma fração");
    }

    @Test
    public void soma() {
        assertEquals("4/20", r1.soma(r2).mostra());
        assertEquals("4/4", r1.soma(r3).mostra());
        assertEquals("4/4", r1.soma(r4).mostra());
        assertEquals("2/10", r2.soma(r3).mostra());
        assertEquals("2/20", r2.soma(r4).mostra());
        assertEquals("2/4", r3.soma(r4).mostra());
    }

    @Test
    public void subtrai() {
        assertEquals("2/20", r1.subtrai(r2).mostra());
        assertEquals("2/4", r1.subtrai(r4).mostra());
        assertEquals("-2/4", r4.subtrai(r1).mostra());
    }

    @Test
    public void multiplica() {
        assertEquals("3/20", r1.multiplica(r2).mostra());
        assertEquals("3/16", r1.multiplica(r4).mostra());
        assertEquals("3/8", r1.multiplica(r3).mostra());
    }

    @Test
    public void divide() {
        assertEquals("15/4", r1.divide(r2).mostra());
        assertEquals("12/4", r1.divide(r4).mostra());
        assertEquals("6/4", r1.divide(r3).mostra());
    }

    @Test
    public void mostra() {
        assertEquals("3/4", r1.mostra());
        assertEquals("1/5", r2.mostra());
        assertEquals("1/2", r3.mostra());
    }
}
