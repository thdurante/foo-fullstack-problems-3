package br.ufg.inf.ex1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexoTest {

    private Complexo c1;
    private Complexo c2;
    private Complexo c3;

    @Before
    public void setUp() {
        this.c1 = new Complexo(6, 5);
        this.c2 = new Complexo(2, 1);
        this.c3 = new Complexo();
    }

    @Test
    public void mostra() {
        assertEquals("(6.0, 5.0)", c1.mostra());
        assertEquals("(2.0, 1.0)", c2.mostra());
        assertEquals("(3.0, 7.0)", c3.mostra());
    }

    @Test
    public void soma() {
        assertEquals(8 + 6 * Math.sqrt(-1), c1.soma(c2), 0);
        assertEquals(9 + 12 * Math.sqrt(-1), c1.soma(c3), 0);
        assertEquals(5 + 8 * Math.sqrt(-1), c2.soma(c3), 0);
        assertEquals(c1.soma(c2), c2.soma(c1), 0);
    }

    @Test
    public void subtrai() {
        assertEquals(4 + 4 * Math.sqrt(-1), c1.subtrai(c2), 0);
        assertEquals(3 + -2 * Math.sqrt(-1), c1.subtrai(c3), 0);
        assertEquals(0 + -6 * Math.sqrt(-1), c2.subtrai(c3), 0);
        assertEquals(c1.subtrai(c2), c2.subtrai(c1), 0);
    }
}
