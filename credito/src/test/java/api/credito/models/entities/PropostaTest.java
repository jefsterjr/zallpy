package api.credito.models.entities;

import api.credito.models.enums.EstadoCivilEnum;
import api.credito.models.enums.EstadoEnum;
import api.credito.models.enums.SexoEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropostaTest {

    private Proposta proposta;

    @Before
    public void init() {
        proposta = new Proposta();
    }

    @Test
    public void testId() {
        proposta.setId(1L);
        assertEquals(1L, proposta.getId().longValue());
    }

    @Test
    public void testIdade() {
        proposta.setIdade(1);
        assertEquals(Integer.valueOf(1), proposta.getIdade());
    }

    @Test
    public void testCpf() {
        proposta.setCpf("00000000000");
        assertEquals("00000000000", proposta.getCpf());
    }

    @Test
    public void testNome() {
        proposta.setNome("Nome");
        assertEquals("Nome", proposta.getNome());
    }

    @Test
    public void testSexo() {
        proposta.setSexo(SexoEnum.M);
        Assert.assertEquals(SexoEnum.M, proposta.getSexo());
    }

    @Test
    public void testEstadoCivil() {
        proposta.setEstadoCivil(EstadoCivilEnum.SOLTEIRO);
        Assert.assertEquals(EstadoCivilEnum.SOLTEIRO, proposta.getEstadoCivil());
    }

    @Test
    public void testEstado() {
        proposta.setEstado(EstadoEnum.SC);
        Assert.assertEquals(EstadoEnum.SC, proposta.getEstado());
    }

    @Test
    public void testDependentes() {
        proposta.setDependentes(1);
        assertEquals(Integer.valueOf(1), proposta.getDependentes());
    }

    @Test
    public void testRenda() {
        proposta.setRenda(2500.0);
        assertEquals(2500.0, proposta.getRenda(), 0.0);
    }
}
