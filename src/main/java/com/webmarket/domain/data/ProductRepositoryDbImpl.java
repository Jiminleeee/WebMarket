package com.webmarket.domain.data;

import java.util.Collections;
import java.util.List;

import com.webmarket.domain.data.dao.ProductDao;
import com.webmarket.domain.model.Product;
import com.webmarket.domain.repository.ProductRepository;

public class ProductRepositoryDbImpl implements ProductRepository {
	private ProductDao dao;
	
	//생성자
	//인터페이스를 받는다 .> 나중에 오라클로 바꿀 수도 있기 때문
	public ProductRepositoryDbImpl(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();	//빈 리스트 만들기
	}

	@Override
	public Product getProductById(String id) {
		return getAllProducts().stream()
				.filter((product) -> product.getId().equals(id))	//조건
				.findFirst()	//첫번째
				.get();	//얻기
	}

	@Override
	public void addProduct(Product product) {
		dao.insert(product);
		
	}

}
