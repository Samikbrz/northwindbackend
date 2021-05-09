package programming.northwind.business.abstracts;

import programming.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
