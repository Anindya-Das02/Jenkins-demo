package in.das.app.jenkins.service;

import in.das.app.jenkins.model.Product;
import in.das.app.jenkins.processor.ProductProcessor;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class ProductService {

    private final ProductProcessor productProcessor;

    public List<Product> getAllProducts(){
        log.info("invoked ProductService::getAllProducts");
        return productProcessor.getAllProducts();
    }
}
