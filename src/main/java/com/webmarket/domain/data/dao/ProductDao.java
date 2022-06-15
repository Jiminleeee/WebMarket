package com.webmarket.domain.data.dao;

import java.util.List;
import com.webmarket.domain.model.Product;

//DAO : Data Access Object
//DB랑 연결할 것
public interface ProductDao {
	// interface 안에 작성한 멤버는 public final static이 생략되어 있다. 
//	String TABLE_NAME = "product";
//	String COLUMN_ID = "p_id";
	
	// interface 안에서는 public이 생략되어 있고 public만 됨
	List<Product> getAll();
	
	void insert(Product product); 
	
	
	void update(Product product); 
	
	void delete(Product product); 
	
}
