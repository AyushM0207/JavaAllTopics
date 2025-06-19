package akm.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import akm.com.entity.Product;
import akm.com.repositery.ProductRepository;
@Service
public class ProductServiceImpl implements IproductService{
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> allProducts = productRepository.findAll();
		return allProducts;
	}

	@Override
	public Product getOneProductById(Integer prodId) {
		return productRepository.findById(prodId).orElse(null);
	}

	@Override
	public void deleteProductById(Integer prodId) {
		productRepository.deleteById(prodId);
		
	}
	

}
