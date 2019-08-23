package zallpy.proposta.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zallpy.proposta.models.entities.Usuario;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

;

@RestController
public class UsuarioController {

    @RequestMapping("/login")
    public boolean login(@RequestBody Usuario usuario) {
        return usuario.getUserName().equals("user") && usuario.getPassword().equals("password");
    }

    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
        return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
    }
}
