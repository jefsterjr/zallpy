package zallpy.proposta.models.dto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import zallpy.proposta.models.enums.EstadoCivilEnum;
import zallpy.proposta.models.enums.EstadoEnum;
import zallpy.proposta.models.enums.SexoEnum;

import static org.junit.Assert.assertEquals;

public class PropostaDTOTest {

    private PropostaDTO propostaDTO;

    private final static String TESTE = "TESTE";

    @Before
    public void init() {
        propostaDTO = new PropostaDTO();
    }

    @Test
    public void testId() {
        propostaDTO.setId(1L);
        assertEquals(1L, propostaDTO.getId().longValue());
    }

    @Test
    public void testIdade() {
        propostaDTO.setIdade(1);
        assertEquals(Integer.valueOf(1), propostaDTO.getIdade());
    }

    @Test
    public void testCpf() {
        propostaDTO.setCpf("00000000000");
        assertEquals("00000000000", propostaDTO.getCpf());
    }

    @Test
    public void testNome() {
        propostaDTO.setNome("Nome");
        assertEquals("Nome", propostaDTO.getNome());
    }

    @Test
    public void testSexo() {
        propostaDTO.setSexo(SexoEnum.M);
        Assert.assertEquals(SexoEnum.M, propostaDTO.getSexo());
    }

    @Test
    public void testEstadoCivil() {
        propostaDTO.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        Assert.assertEquals(EstadoCivilEnum.SOLTEIRO, propostaDTO.getEstadoCivil());
    }

    @Test
    public void testEstado() {
        propostaDTO.setEstado(EstadoEnum.SC);
        assertEquals(EstadoEnum.SC, propostaDTO.getEstado());
    }

    @Test
    public void testDependentes() {
        propostaDTO.setDependentes(1);
        assertEquals(Integer.valueOf(1), propostaDTO.getDependentes());
    }

    @Test
    public void testRenda() {
        propostaDTO.setRenda(2500.0);
        assertEquals(2500.0, propostaDTO.getRenda(), 0.0);
    }
}
