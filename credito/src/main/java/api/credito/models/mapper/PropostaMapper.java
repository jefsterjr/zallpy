package api.credito.models.mapper;

import api.credito.models.dto.PropostaDTO;
import api.credito.models.entities.Proposta;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PropostaMapper extends MapperBase<Proposta, PropostaDTO>{

}
