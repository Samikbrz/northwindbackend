package programming.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import programming.northwind.business.abstracts.ProductService;
import programming.northwind.dataaccess.abstracts.ProductRepository;
import programming.northwind.entities.concretes.Product;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
