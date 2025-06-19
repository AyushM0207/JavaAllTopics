package akm.com.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import akm.com.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
