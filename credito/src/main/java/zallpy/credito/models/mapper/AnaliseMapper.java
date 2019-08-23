package zallpy.credito.models.mapper;

import org.mapstruct.Mapper;
import zallpy.credito.models.entities.Analise;
import zallpy.credito.models.dto.AnaliseDTO;

@Mapper(componentModel="spring")
public interface AnaliseMapper extends MapperBase<Analise, AnaliseDTO>{

}
