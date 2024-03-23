package in.das.app.jenkins.processor;

import in.das.app.jenkins.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@AllArgsConstructor
public class ProductProcessor {

    private final List<Product> productsDatabase;

    public List<Product> getAllProducts(){
        log.info("fetching all products from DB");
        log.info("DB Result: {}", productsDatabase);
        return productsDatabase;
    }
}
