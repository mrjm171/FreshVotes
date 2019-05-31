package co.uk.pickmefirst.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.uk.pickmefirst.domain.Product;
import co.uk.pickmefirst.domain.User;

public interface ProductRepository extends JpaRepository<Product, Long>{

  @Query("select p from Product p"
      + " join fetch p.user"
      + " where p.id = :id")
  Optional<Product> findByIdWithUser(Long id);
  
  List<Product> findByUser(User user);
}