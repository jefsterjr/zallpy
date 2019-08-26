package api.proposta.models.mapper;

import api.proposta.models.dto.PropostaDTO;
import api.proposta.models.entities.Proposta;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PropostaMapper extends MapperBase<Proposta, PropostaDTO>{

}
