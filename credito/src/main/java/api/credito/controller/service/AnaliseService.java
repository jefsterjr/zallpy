package api.credito.controller.service;

import api.credito.models.dto.AnaliseDTO;

import java.util.List;

public interface AnaliseService {

    void analisar(Long idProposta);

    List<AnaliseDTO> findAll();

    List<AnaliseDTO> findByCpf(String cpf);
}
