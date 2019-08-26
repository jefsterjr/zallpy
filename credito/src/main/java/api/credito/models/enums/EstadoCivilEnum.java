package api.credito.models.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum EstadoCivilEnum {

    SOLTEIRO("Solteiro(a)"), CASADO("Casado(a)"), DIVORCIADO("Divorciado(a)"), UNIAO_ESTAVEL("União Estável"), VIUVO("Viúvo(a)");

    private String descricao;

    EstadoCivilEnum(String descricao) {
        this.descricao = descricao;
    }

    private String getDescricao() {
        return descricao;
    }

    public static Map getMap() {
        return Arrays.stream(EstadoCivilEnum.values()).collect(Collectors.toMap(Enum::toString, EstadoCivilEnum::getDescricao, (a, b) -> b));
    }
}
