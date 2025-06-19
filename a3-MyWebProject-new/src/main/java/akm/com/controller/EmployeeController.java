package akm.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import akm.com.model.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/home")
	
	public String loadHomePage(Model model) {
		Employee employee = new Employee();
		model.addAttribute("emp",employee);
		return "home";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("emp") Employee employee, Model model) {
		System.out.println(employee.getEId());
		System.out.println(employee.getEName());
		System.out.println(employee.getEAdd());
		
		model.addAttribute("msg", "Data has been saved Successfully !");
		return "home";
	}
	@GetMapping("/register")
	public String loadRegistrationPage(Model model) {
		Employee employee = new Employee();
		 model.addAttribute("employee",employee);
		return "register";
		}
	
	
}
