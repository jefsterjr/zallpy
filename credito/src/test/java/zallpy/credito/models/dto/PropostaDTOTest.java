package zallpy.credito.models.dto;

import org.junit.Before;
import org.junit.Test;
import zallpy.credito.models.enums.EstadoCivilEnum;
import zallpy.credito.models.enums.EstadoEnum;
import zallpy.credito.models.enums.SexoEnum;

import static org.junit.Assert.assertEquals;

public class PropostaDTOTest {

    private PropostaDTO propostaDTO;

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
        propostaDTO.setSexo(SexoEnum.M.toString());
        assertEquals("M", propostaDTO.getSexo());
    }

    @Test
    public void testEstadoCivil() {
        propostaDTO.setEstadoCivil(EstadoCivilEnum.SOLTEIRO.toString());
        assertEquals("SOLTEIRO", propostaDTO.getEstadoCivil());
    }

    @Test
    public void testEstado() {
        propostaDTO.setEstado(EstadoEnum.SC.toString());
        assertEquals("SC", propostaDTO.getEstado());
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
