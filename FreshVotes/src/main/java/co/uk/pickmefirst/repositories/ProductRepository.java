package co.uk.pickmefirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.uk.pickmefirst.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}