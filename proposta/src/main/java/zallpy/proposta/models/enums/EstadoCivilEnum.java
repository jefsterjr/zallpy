package zallpy.proposta.models.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum EstadoCivilEnum{

    SOLTEIRO("Solteiro"), CASADO("Casado"), DIVORCIADO("Divorciado"), UNIAO_ESTAVEL("União Estável"), OUTRO("Outro");

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

    public static Map<String, String> getConstantMap() {
        return Arrays.stream(EstadoCivilEnum.values()).collect(Collectors.toMap(EstadoCivilEnum::getDescricao, Enum::toString, (a, b) -> b));
    }
}
