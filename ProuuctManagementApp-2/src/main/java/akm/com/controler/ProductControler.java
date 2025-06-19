package akm.com.controler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import akm.com.entity.Product;
import akm.com.service.IproductService;

public class ProductControler {
	private IproductService iproductService;
	
	@GetMapping("/")
	public String firstPage(Model model) {
		model.addAttribute("productList", iproductService.getAllProduct());
	return "index";
	}
	@PostMapping("/save")
	public String saveProduct(Product product) {
		return "";
	}
	
	@GetMapping("/all")
	public String getAllProduct(){
		
		return "";
	}
	
	@GetMapping("/update")
	public String getOneProductById(Integer prodId) {
		
		return "";
	}
	@GetMapping("/delete")
	public String deleteProductById(Integer prodId) {
		
		return "";
	}
}
