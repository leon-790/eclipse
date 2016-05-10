package com.califo.dao;

import java.util.List;

import com.califo.model.Product;

public interface ProductDao {
		public boolean saveProduct(Product p);
		
		public Product findProductById(int id);
		
		public boolean deleteProduct(int id);
		
		public boolean updateProduct(Product p);
		
		public List<Product> findProduct();
}
