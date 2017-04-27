package br.ufg.inf.ex6;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperarioTest {

    private Operario operario;

    @Test
    public void classificaOperarioComoCategoriaA() {
        operario = new Operario("123", 10, 'M');
        operario.setCategoria();

        assertEquals('A', operario.getCategoria());
    }

    @Test
    public void classificaOperarioComoCategoriaB() {
        operario = new Operario("123", 25, 'M');
        operario.setCategoria();

        assertEquals('B', operario.getCategoria());
    }

    @Test
    public void classificaOperarioComoCategoriaC() {
        operario = new Operario("123", 40, 'M');
        operario.setCategoria();

        assertEquals('C', operario.getCategoria());
    }

    @Test
    public void calculaSalarioCorretamenteCategoriaA() {
        operario = new Operario("123", 10, 'M');
        operario.setCategoria();
        operario.setSalario();

        assertEquals(937, operario.getSalario(), 0);
    }

    @Test
    public void calculaSalarioCorretamenteCategoriaB() {
        operario = new Operario("123", 25, 'M');
        operario.setCategoria();
        operario.setSalario();

        assertEquals(1639.75, operario.getSalario(), 0);
    }

    @Test
    public void calculaSalarioCorretamenteCategoriaC() {
        operario = new Operario("123", 60, 'M');
        operario.setCategoria();
        operario.setSalario();

        assertEquals(3045.25, operario.getSalario(), 0);
    }
}