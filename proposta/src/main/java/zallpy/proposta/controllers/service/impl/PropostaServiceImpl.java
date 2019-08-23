package zallpy.proposta.controllers.service.impl;

import zallpy.proposta.controllers.service.PropostaService;
import zallpy.proposta.models.dto.PropostaDTO;
import zallpy.proposta.models.entities.Proposta;
import zallpy.proposta.models.mapper.PropostaMapper;
import zallpy.proposta.models.repository.PropostaRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PropostaServiceImpl implements PropostaService {

    private static final Logger logger = LogManager.getLogger(PropostaServiceImpl.class);

    @Autowired
    private PropostaRepository repository;

    @Autowired
    private PropostaMapper mapper;

    @Override
    public void insert(PropostaDTO propostaDTO) {
        Proposta p = repository.save(mapper.toEntity(propostaDTO));
//        analisarProposta(p.getId());
    }

    private void analisarProposta(Long id) {
        final String uri = "http://localhost:8400/analise/" + id;
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForEntity(uri, ResponseEntity.class);
    }
}
