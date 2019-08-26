package api.credito.models.enums;

public enum ResultadoAnaliseEnum {

    APROVADO("Aprovado"),NEGADO("Negado");

    private String descricao;

    ResultadoAnaliseEnum(String descricao) {
        this.descricao = descricao;
    }
}
