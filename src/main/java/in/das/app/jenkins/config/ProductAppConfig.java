package in.das.app.jenkins.config;

import in.das.app.jenkins.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductAppConfig {

    @Bean
    public List<Product> productsDatabase(){
        return List.of(
                new Product("HY231","Lux soap",30.00),
                new Product("DE151","School Bog",300.00),
                new Product("WB789","Boroline",15.00),
                new Product("HY591","Toothpaste",20.00)
        );
    }
}
