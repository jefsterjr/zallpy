package zallpy.proposta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "zallpy.proposta")
public class ZallpyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZallpyApplication.class, args);
    }
}
