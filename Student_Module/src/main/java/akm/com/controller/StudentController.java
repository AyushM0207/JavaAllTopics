package akm.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import akm.com.entity.Student;
import akm.com.service.IStudentService;

@Controller
public class StudentController {
	@Autowired
	 private IStudentService iStudentService;
	
	@GetMapping("/home")
	public String getAllStudent(Model model) {
		model.addAttribute("list", iStudentService.getAllStudent());
		return "veiw_Student";
	}
	@GetMapping("/register")
	public String stuReg(Model model) {
		
		model.addAttribute("student", new Student());
		return "stu_Register";
	}
	
	
	public String createStudent(@ModelAttribute Student student, Model model) {
		
		
		return "stu_Register";
		
	}
}
  