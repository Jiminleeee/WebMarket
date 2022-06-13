package com.webmarket.domain.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import com.webmarket.domain.model.Product;

//다형성
public class ProductRepository {
	public static void main(String[] args) {
		// 삽입 삭제가 빈번할 때 항상 동일 성능 
		//but, ArrayList보다 검색이 느리고 메모리를 조금 더 많이 필요
		List<Product> products = new LinkedList<>();	
		
		//크기가 커질 수록 삽입, 삭제가 느려짐, 내부적으로 배열이라 성능이 빠름
		List<Product> products2 = new ArrayList<>();	
		
		Product[] products3 = new Product[3];
		sort(Arrays.asList(products3));
		
		sort(products2);
		
	}
	
	public static List<Product> sort(List<Product> products) {
		//정렬...
		return new LinkedList<>();
	}
	
}
