package akm.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import akm.com.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
