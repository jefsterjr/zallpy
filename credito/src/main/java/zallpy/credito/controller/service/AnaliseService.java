package zallpy.credito.controller.service;

import zallpy.credito.models.dto.AnaliseDTO;

import java.util.List;

public interface AnaliseService {

    void analisar(Long idProposta);

    List<AnaliseDTO> findAll();

    List<AnaliseDTO> findByCpf(String cpf);
}
