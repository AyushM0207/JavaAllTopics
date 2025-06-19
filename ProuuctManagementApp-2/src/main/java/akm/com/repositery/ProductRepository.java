package akm.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;


import akm.com.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
