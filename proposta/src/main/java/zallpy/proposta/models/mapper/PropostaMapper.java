package zallpy.proposta.models.mapper;

import zallpy.proposta.models.dto.PropostaDTO;
import zallpy.proposta.models.entities.Proposta;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface PropostaMapper extends MapperBase<Proposta, PropostaDTO>{

}
