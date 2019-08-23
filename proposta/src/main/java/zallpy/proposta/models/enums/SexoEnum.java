package zallpy.proposta.models.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum SexoEnum {

    M("Masculino"), F("Feminino");

    private String descricao;

    SexoEnum(String descri) {
        this.descricao = descri;
    }

    public static Map getMap() {
        return Arrays.stream(SexoEnum.values()).collect(Collectors.toMap(Enum::toString, SexoEnum::getDescricao, (a, b) -> b));
    }

    public String getDescricao() {
        return descricao;
    }
}
