package api.credito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "api.credito")
public class CreditoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CreditoApplication.class, args);
    }

}
