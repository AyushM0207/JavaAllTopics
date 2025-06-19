package akm.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import akm.com.entity.Fee;

public interface FeeRepo extends JpaRepository<Fee, Integer>{

}
