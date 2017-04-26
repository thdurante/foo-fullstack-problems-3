package br.ufg.inf.ex5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmpresaTest {

    private Empresa empresa;

    @Before
    public void setUp() {
        empresa = new Empresa();
    }

    @Test
    public void contrataComerciario() {
        Comerciario comerciario = new Comerciario(1, 10, 10, 1000);
        empresa.contrataComerciario(comerciario);

        assertEquals(comerciario, empresa.getFuncionarios().get(0));
    }
}