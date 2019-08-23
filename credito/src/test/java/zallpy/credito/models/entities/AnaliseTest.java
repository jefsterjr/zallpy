package zallpy.credito.models.entities;

import org.junit.Before;
import org.junit.Test;
import zallpy.credito.models.enums.LimiteEnum;
import zallpy.credito.models.enums.ResultadoAnaliseEnum;

import static org.junit.Assert.assertEquals;

public class AnaliseTest {

    private Analise analise;

    private final static String TESTE = "TESTE";

    @Before
    public void init() {
        analise = new Analise();
    }

    @Test
    public void testId() {
        analise.setId(1L);
        assertEquals(1L, analise.getId().longValue());
    }

    @Test
    public void testResultadoAnalise() {
        analise.setResultadoAnalise(ResultadoAnaliseEnum.APROVADO);
        assertEquals(ResultadoAnaliseEnum.APROVADO, analise.getResultadoAnalise());
    }

    @Test
    public void testLimite() {
        analise.setLimite(LimiteEnum.REPROVADO);
        assertEquals(LimiteEnum.REPROVADO, analise.getLimite());
    }

    @Test
    public void testProposta() {
        final Proposta proposta = new Proposta();
        analise.setProposta(proposta);
        assertEquals(proposta, analise.getProposta());
    }
}
