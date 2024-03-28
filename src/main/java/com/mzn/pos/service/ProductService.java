package com.mzn.pos.service;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

import com.mzn.pos.model.entity.Product;

public interface ProductService {

	Product createProduct(@RequestBody Product product);

	List<Product> getAllProducts();

	Product getProductById(Long id);

	Product updateProduct(Long id, Product product);

	void deleteProduct(Long id);
	
	List<Product> createProducts(List<Product> products);
}
