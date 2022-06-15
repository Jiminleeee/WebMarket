package com.webmarket.domain.repository;

import java.util.List;

import com.webmarket.domain.data.ProductRepositoryDbImpl;
import com.webmarket.domain.data.ProductRepositoryimpl;
import com.webmarket.domain.data.dao.MySqlProductDaoImpl;
import com.webmarket.domain.model.Product;

public interface ProductRepository {
    
    public static ProductRepository getInstance() {
        return new ProductRepositoryDbImpl(new MySqlProductDaoImpl());
    }
    
    public List<Product> getAllProducts();
    
    public Product getProductById(String id);
    
    public void addProduct(Product product);
}