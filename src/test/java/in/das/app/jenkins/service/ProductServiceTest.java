package in.das.app.jenkins.service;

import in.das.app.jenkins.model.Product;
import in.das.app.jenkins.processor.ProductProcessor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductProcessor productProcessor;

    @InjectMocks
    private ProductService productService;

    @Test
    public void getAllProductsTest(){
        List<Product> products = List.of(new Product("TP123","test",30.00));
        when(productProcessor.getAllProducts()).thenReturn(products);
        List<Product> actualProducts = productService.getAllProducts();
        assertAll(
                () -> assertEquals(1,actualProducts.size())
        );
    }
}