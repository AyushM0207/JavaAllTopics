package akm.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akm.com.entity.Student;
import akm.com.exception.StudentNoTFoundException;
import akm.com.repositery.StudentRepo;

@Service
public class StudentServiceImpl implements IStudentService{

	@Autowired
	private StudentRepo repo;
	
	@Override
	public boolean createStudent(Student student) {
		return repo.save(student).getId()!=null? true:false;	
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student getStudentById(Integer sId) {
		Student student = null;
		Optional<Student> stuOptional = repo.findById(sId);
		if(stuOptional.isPresent()) {
			student = stuOptional.get();
		}else {
			throw new StudentNoTFoundException("Student Not Available");
		}
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		repo.save(student);
		
	}

	@Override
	public void deleteStudent(Integer sId) {
		Student student = getStudentById(sId);
		repo.delete(student);
	}
	
	

}
