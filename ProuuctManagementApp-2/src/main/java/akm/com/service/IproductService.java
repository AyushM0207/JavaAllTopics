package akm.com.service;

import java.util.List;

import akm.com.entity.Product;

public interface IproductService {
	public void saveProduct(Product product);
	public List<Product> getAllProduct();
	public Product getOneProductById(Integer prodId);
	public void deleteProductById(Integer prodId);


}
