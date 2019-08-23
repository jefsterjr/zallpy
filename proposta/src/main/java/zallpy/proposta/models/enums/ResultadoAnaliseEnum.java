package zallpy.proposta.models.enums;

public enum ResultadoAnaliseEnum {

    APROVADO("Aprovado"),REPROVADO("Reprovado");

    private String descricao;

    ResultadoAnaliseEnum(String descricao) {
        this.descricao = descricao;
    }
}
