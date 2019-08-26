package api.credito.models.dto;

public class AnaliseDTO {

    private Long id;

    private String resultadoAnalise;

    private String limite;

    private PropostaDTO proposta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResultadoAnalise() {
        return resultadoAnalise;
    }

    public void setResultadoAnalise(String resultadoAnalise) {
        this.resultadoAnalise = resultadoAnalise;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public PropostaDTO getProposta() {
        return proposta;
    }

    public void setProposta(PropostaDTO proposta) {
        this.proposta = proposta;
    }
}
