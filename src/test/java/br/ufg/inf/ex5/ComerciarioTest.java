package br.ufg.inf.ex5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComerciarioTest {

    private Comerciario comerciario;

    @Before
    public void setUp() {
        comerciario = new Comerciario(1, 10, 30, 3000.00);
    }

    @Test
    public void calculaSalarioBrutoCorretamente() {
        comerciario.setSalarioBruto();

        assertEquals(4400.00, comerciario.getSalarioBruto(), 0.00);
    }

    @Test
    public void calculaSalarioLiquidoFalhaPoisNaoHaSalarioBruto() {
        comerciario.setSalarioLiquido();

        assertEquals(0.00, comerciario.getSalarioLiquido(), 0.00);
    }

    @Test
    public void calculaSalarioLiquidoCorretamente() {
        comerciario.setSalarioBruto();
        comerciario.setSalarioLiquido();

        assertEquals(3828.0, comerciario.getSalarioLiquido(), 0.00);
    }
}