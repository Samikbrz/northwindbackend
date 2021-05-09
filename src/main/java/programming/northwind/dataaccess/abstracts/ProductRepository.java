package programming.northwind.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import programming.northwind.entities.concretes.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
