package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.put.poznan.transformer.logic.QualityChecker;

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class TextTransformerApplication {
    @Bean
    public QualityChecker qualityChecker() {
        return new QualityChecker();
    }

    public static void main(String[] args) {
        SpringApplication.run(TextTransformerApplication.class, args);
    }
}
