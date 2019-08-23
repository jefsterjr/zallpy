package zallpy.credito.controller.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zallpy.credito.controller.service.AnaliseService;
import zallpy.credito.models.dto.AnaliseDTO;
import zallpy.credito.models.entities.Analise;
import zallpy.credito.models.entities.Proposta;
import zallpy.credito.models.enums.EstadoCivilEnum;
import zallpy.credito.models.enums.LimiteEnum;
import zallpy.credito.models.enums.ResultadoAnaliseEnum;
import zallpy.credito.models.mapper.AnaliseMapper;
import zallpy.credito.models.repository.AnaliseRepository;
import zallpy.credito.models.repository.PropostaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Classe de serviço
 */
@Service
public class AnaliseServiceImpl implements AnaliseService {

    @Autowired
    private AnaliseRepository repository;

    @Autowired
    private PropostaRepository propostaRepository;

    @Autowired
    private AnaliseMapper mapper;

    @Override
    public void analisar(final Long idProposta) {

        final Optional<Proposta> oProposta = propostaRepository.findById(idProposta);
        if (oProposta.isPresent()) {
            final Proposta proposta = oProposta.get();
            Analise analise = new Analise();
            analise.setProposta(proposta);
            if (proposta.getRenda() < 1000) {
                analise.setResultadoAnalise(ResultadoAnaliseEnum.NEGADO);
                analise.setLimite(LimiteEnum.RENDA_BAIXA);
            } else if (rendaPerCapita(proposta) < 500 || proposta.getEstadoCivil().equals(EstadoCivilEnum.DIVORCIADO)) {
                analise.setResultadoAnalise(ResultadoAnaliseEnum.NEGADO);
                analise.setLimite(LimiteEnum.REPROVADO);
            } else if(proposta.getEstadoCivil().equals(EstadoCivilEnum.SOLTEIRO)){
                for(LimiteEnum limiteEnum : LimiteEnum.values()){
                    if((rendaPerCapita(proposta)) / 3.0 > limiteEnum.getValorMinimo() && (rendaPerCapita(proposta)) / 3.0 <= limiteEnum.getValorMaximo()){
                        analise.setLimite(limiteEnum);
                        break;
                    }
                }
                analise.setResultadoAnalise(ResultadoAnaliseEnum.APROVADO);
            }else{
                for(LimiteEnum limiteEnum : LimiteEnum.values()){
                    if(rendaPerCapita(proposta) >= limiteEnum.getValorMinimo() && rendaPerCapita(proposta) <= limiteEnum.getValorMaximo()){
                        analise.setLimite(limiteEnum);
                        break;
                    }
                }
                analise.setResultadoAnalise(ResultadoAnaliseEnum.APROVADO);
            }
            repository.save(analise);
        }
    }

    @Override
    public List<AnaliseDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    @Override
    public List<AnaliseDTO> findByCpf(String cpf) {
        return mapper.toDTO(repository.findAllByPropostaCpf(cpf));
    }

    private double rendaPerCapita(Proposta proposta) {
        return proposta.getRenda() / (proposta.getDependentes().doubleValue() + 1);
    }
}
