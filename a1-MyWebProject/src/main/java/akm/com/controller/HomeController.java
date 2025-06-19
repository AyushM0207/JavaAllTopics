package akm.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import akm.com.modal.Student;

@Controller
public class HomeController {

	@GetMapping("/index")
	public String homePage(Model model) {
		Student student = new Student();
		model.addAttribute("stu", student);
		
		return "index";
	}
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("stu") Student student, Model model) {
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getScourse());
		
		model.addAttribute("msg", "Data has been Successfully Added !");
		return "index";
	}
}
