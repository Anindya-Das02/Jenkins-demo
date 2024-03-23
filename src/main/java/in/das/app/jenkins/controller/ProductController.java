package in.das.app.jenkins.controller;

import in.das.app.jenkins.model.Product;
import in.das.app.jenkins.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/test")
    public ResponseEntity<?> test(){
        log.info("invoked ProductController::test");
        return ResponseEntity.ok(Map.of("message","server up","status",200));
    }

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        log.info("invoked ProductController::getAllProducts");
        return productService.getAllProducts();
    }
}
