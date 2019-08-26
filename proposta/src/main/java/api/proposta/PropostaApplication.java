package api.proposta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "api.proposta")
public class PropostaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PropostaApplication.class, args);
    }
}
