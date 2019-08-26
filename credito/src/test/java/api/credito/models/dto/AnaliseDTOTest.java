package api.credito.models.dto;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnaliseDTOTest {


    private AnaliseDTO analiseDTO;

    private final static String TESTE = "TESTE";

    @Before
    public void init() {
        analiseDTO = new AnaliseDTO();
    }

    @Test
    public void testId() {
        analiseDTO.setId(1L);
        assertEquals(1L, analiseDTO.getId().longValue());
    }

    @Test
    public void testResultadoAnalise() {
        analiseDTO.setResultadoAnalise(TESTE);
        assertEquals(TESTE, analiseDTO.getResultadoAnalise());
    }

    @Test
    public void testLimite() {
        analiseDTO.setLimite(TESTE);
        assertEquals(TESTE, analiseDTO.getLimite());
    }

    @Test
    public void testProposta() {
        final PropostaDTO propostaDTO = new PropostaDTO();
        analiseDTO.setProposta(propostaDTO);
        assertEquals(propostaDTO, analiseDTO.getProposta());
    }

}
