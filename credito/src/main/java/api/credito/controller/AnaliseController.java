package api.credito.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import api.credito.models.dto.AnaliseDTO;
import api.credito.controller.service.AnaliseService;
import api.credito.models.enums.LimiteEnum;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/analise")
public class AnaliseController {

    @Autowired
    private AnaliseService service;

    @ApiOperation(value = "Realiza a análise indentificando pelo ID da proposta")
    @GetMapping(path = "/{id}")
    public ResponseEntity analisar(@PathVariable Long id){
        service.analisar(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @ApiOperation(value = "Consulta todas as analises")
    @GetMapping
    public ResponseEntity<List<AnaliseDTO>> findAll(){
        try{
            return ResponseEntity.ok(service.findAll());
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }

    }

    @ApiOperation(value = "Consulta as analises filtrando o CPF")
    @GetMapping(path = "/filtrar")
    public ResponseEntity<List<AnaliseDTO>> findByCpf(@RequestParam String cpf){
        return ResponseEntity.ok(service.findByCpf(cpf));
    }

    @ApiOperation(value = "Retorna o enum de limites")
    @GetMapping(path = "/limites")
    public Map getLimites() {
        return LimiteEnum.getMap();
    }

}
