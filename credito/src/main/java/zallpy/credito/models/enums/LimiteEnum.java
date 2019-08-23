package zallpy.credito.models.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum LimiteEnum {

    RENDA_BAIXA("Renda Baixa", 0.0, 0.0),
    REPROVADO("Reprovado pela política de crédito", 0.0, 0.0),
    FAIXA_500("Entre 100 - 500", 100.0, 500.0),
    FAIXA_1000("Entre 500 - 1000", 500.0, 1000.0),
    FAIXA_1500("Entre 1000 - 1500", 1000.0, 1500.0),
    FAIXA_2000("Entre 1500 - 2000", 1500.0, 2000.0),
    ACIMA_2000("Acima de 2000", 2000.0, Double.MAX_VALUE);


    private String descricao;
    private Double valorMinimo;
    private Double ValorMaximo;

    LimiteEnum(String descricao, Double valorMinimo, Double valorMaximo) {
        this.descricao = descricao;
        this.valorMinimo = valorMinimo;
        ValorMaximo = valorMaximo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public Double getValorMaximo() {
        return ValorMaximo;
    }

    public static Map getMap() {
        return Arrays.stream(LimiteEnum.values()).collect(Collectors.toMap(Enum::toString, LimiteEnum::getDescricao, (a, b) -> b));
    }
}
