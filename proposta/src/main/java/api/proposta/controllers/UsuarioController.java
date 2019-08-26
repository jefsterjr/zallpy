package api.proposta.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.proposta.models.entities.Usuario;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

/**
 * REST controller de Usuário
 */


@RestController
public class UsuarioController {

    @ApiOperation(value = "Login de usuário")
    @RequestMapping("/login")
    public boolean login(@RequestBody Usuario usuario) {
        return usuario.getUserName().equals("user") && usuario.getPassword().equals("password");
    }

    @ApiOperation(value = "Retorna informações do login")
    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
        return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
    }
}
