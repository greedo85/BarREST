package barrest.service;

import barrest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.List;

@Service
public class ProductService {

    barrest.repository.ProductRepository productRepository;

    @Autowired

    public ProductService( barrest.repository.ProductRepository productRepository ) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
