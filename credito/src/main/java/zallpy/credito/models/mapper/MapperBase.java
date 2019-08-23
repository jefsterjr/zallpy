package zallpy.credito.models.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface MapperBase<E, DTO> {

    DTO toDTO(E entity);

    E toEntity(DTO dto);

    List<DTO> toDTO(List<E> e);

    List<E> toEntity(List<DTO> dto);

    E map(DTO dto, @MappingTarget E entity);
}