package zallpy.proposta.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zallpy.proposta.controllers.service.PropostaService;
import zallpy.proposta.models.dto.PropostaDTO;
import zallpy.proposta.models.enums.EstadoCivilEnum;
import zallpy.proposta.models.enums.EstadoEnum;
import zallpy.proposta.models.enums.SexoEnum;
import zallpy.proposta.models.entities.Proposta;

import java.util.Map;

/**
 * REST Controller de {@link Proposta}
 */
@RestController
@RequestMapping("/proposta")
public class PropostaController {

    @Autowired
    private PropostaService service;

    /**
     * REST Endponit de inserção de propostas
     * @param propostaDTO
     * @return
     */
    @ApiOperation(value = "Cadastro de novas propostas de crédito", httpMethod = "POST")
    @PostMapping
    public ResponseEntity insert(@RequestBody PropostaDTO propostaDTO) {
        service.insert(propostaDTO);
        return ResponseEntity.ok().build();
    }

    /**
     * REST Endponit consulta do enum de estados civis
     * @return
     */
    @ApiOperation(value = "Retorna o enum de estados civis")
    @GetMapping(path = "/estados-civis")
    public Map getEstadosCivis() {
        return EstadoCivilEnum.getMap();
    }

    /**
     * REST Endponit consulta do enum de estados
     * @return
     */
    @ApiOperation(value = "Retorna o enum de estados e UFs")
    @GetMapping(path = "/estados")
    public Map getEstados() {
        return EstadoEnum.getMap();
    }

    /**
     * REST Endponit consulta do enum de sexos
     * @return
     */
    @ApiOperation(value = "Retorna o enum de sexos")
    @GetMapping(path = "/sexos")
    public Map getSexos() {
        return SexoEnum.getMap();
    }


}
