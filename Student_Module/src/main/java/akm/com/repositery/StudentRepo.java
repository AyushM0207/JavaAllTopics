package akm.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import akm.com.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
