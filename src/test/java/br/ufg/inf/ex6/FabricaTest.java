package br.ufg.inf.ex6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FabricaTest {

    private Fabrica fabrica;

    @Before
    public void setUp() {
        fabrica = new Fabrica();
    }

    @Test
    public void calculaTotalFolhaPagamentoCorretamente() {
        criaOperarios('M');

        assertEquals(15413.64, fabrica.getTotalFolhaPagamento(), 0.01);
    }

    @Test
    public void calculaTotalPecasFabricadasCorretamente() {
        criaOperarios('M');

        assertEquals(275, fabrica.getTotalPecasFabricadas(), 0);
    }

    @Test
    public void calculaMediaPecasHomensCategoriaACorretamente() {
        criaOperarios('M');

        assertEquals(7, fabrica.getMediaPecasHomensCategoriaA(), 0);
    }

    @Test
    public void calculaMediaPecasMulheresCategoriaCCorretamente() {
        criaOperarios('F');

        assertEquals(45, fabrica.getMediaPecasMulheresCategoriaC(), 0);
    }

    @Test
    public void obtemOperarioComMaiorSalarioCorretamente() {
        criaOperarios('F');

        assertEquals("10", fabrica.getOperarioMaiorSalario().getMatricula());
    }

    private void criaOperarios(char sexo) {
        for (int i = 1; i <= 10; i++) {
            Operario operario = new Operario(i + "", i * 5, sexo);
            operario.setCategoria();
            operario.setSalario();
            fabrica.contrataOperario(operario);
        }
    }
}