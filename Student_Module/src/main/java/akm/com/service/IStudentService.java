package akm.com.service;

import java.util.List;

import akm.com.entity.Student;

public interface IStudentService {
	public boolean createStudent(Student student);
	public List<Student>getAllStudent();
	public Student getStudentById(Integer sId);
	public void updateStudent(Student student);
	public void deleteStudent(Integer sId);
	
	
	
}
