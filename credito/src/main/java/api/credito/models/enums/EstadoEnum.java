package api.credito.models.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum EstadoEnum {

    AC("Acre"),
    AL("Alagoas"),
    AM("Amazonas"),
    AP("Amapá"),
    BA("Bahia"),
    CE("Ceará"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MG("Minas Gerais"),
    MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
    PA("Pará"),
    PB("Paraíba"),
    PE("Pernanbuco"),
    PI("Piauí"),
    PR("Paraná"),
    RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"),
    RS("Rio Grande do Sul"),
    SC("Florianópolis"),
    SE("Sergipe"),
    SP("São Paulo"),
    TO("Tocantins");

    private String descricao;

    EstadoEnum(String descricao) {
        this.descricao = descricao;
    }

    private String getDescricao() {
        return descricao;
    }

    public static Map getMap() {
        return Arrays.stream(EstadoEnum.values()).collect(Collectors.toMap(Enum::toString, EstadoEnum::getDescricao, (a, b) -> b));
    }
}
