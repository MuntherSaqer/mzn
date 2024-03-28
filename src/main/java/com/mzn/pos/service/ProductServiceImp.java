package com.mzn.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzn.pos.model.entity.Product;
import com.mzn.pos.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id)
                                    .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));

        Product updatedProduct = Product.builder()
                .id(existingProduct.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();

        return productRepository.save(updatedProduct);
    }
    
    @Override
    public List<Product> createProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
