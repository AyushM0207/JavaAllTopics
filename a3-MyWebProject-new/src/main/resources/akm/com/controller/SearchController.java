package akm.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

	@GetMapping("/search")
		public String searchByName(@RequestParam("empId") Stirng username, Model model) {
		model.addAttribute("empId", username);
			
			return"home";
	}
}
