package zallpy.credito.models.mapper;

import org.mapstruct.Mapper;
import zallpy.credito.models.dto.PropostaDTO;
import zallpy.credito.models.entities.Proposta;

@Mapper(componentModel="spring")
public interface PropostaMapper extends MapperBase<Proposta, PropostaDTO>{

}
