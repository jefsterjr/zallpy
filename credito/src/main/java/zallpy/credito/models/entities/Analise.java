package zallpy.credito.models.entities;

import zallpy.credito.models.enums.LimiteEnum;
import zallpy.credito.models.enums.ResultadoAnaliseEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "analise")
public class Analise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "resultado")
    private ResultadoAnaliseEnum resultadoAnalise;

    @Enumerated(EnumType.STRING)
    @Column(name = "limite")
    private LimiteEnum limite;

    @OneToOne
    private Proposta proposta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResultadoAnaliseEnum getResultadoAnalise() {
        return resultadoAnalise;
    }

    public void setResultadoAnalise(ResultadoAnaliseEnum resultadoAnalise) {
        this.resultadoAnalise = resultadoAnalise;
    }

    public void setLimite(LimiteEnum limite) {
        this.limite = limite;
    }

    public LimiteEnum getLimite() {
        return limite;
    }

    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }
}
