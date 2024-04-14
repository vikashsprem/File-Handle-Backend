package FileHandle.repository;
import FileHandle.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product, String> {
}
