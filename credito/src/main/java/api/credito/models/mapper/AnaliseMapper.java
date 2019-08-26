package api.credito.models.mapper;

import api.credito.models.dto.AnaliseDTO;
import api.credito.models.entities.Analise;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface AnaliseMapper extends MapperBase<Analise, AnaliseDTO>{

}
