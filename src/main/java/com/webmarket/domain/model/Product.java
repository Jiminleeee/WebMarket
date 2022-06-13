package com.webmarket.domain.model;

import java.util.Objects;

/* 객체를 생성할 때는, 
 * 1. 무지성 private 멤버 변수
 * 2. 필요하면 생성자 추가
 * 3. 무지성 getter / setter : 읽기 전용, 쓰기 전용 구현 > 객체지향 : 인간 세상과 비슷하게 하자
 * 4. 무지성 toString() : 디버깅 용도, 
 * 5. 필요하면 equals / hashCode 재정의(오버라이드)*/

public class Product {
	
	//객체를 private으로 선언
	private String id;	//상품 id
	private String name;	//상품명
	private int unitPrice;	//상품 가격
	private String description;	//상품 설명
	private String manufacturer;	//제조사
	private String category;	//분류
	private long unitsInStock;	//재고 수
	private String condition;	//신상품, 중고품, 재생품
	
	
	//생성자 만들기 : 마우스 오른쪽 버튼 > source > generate constructor using filed > 필요한 것 지정 후 > generate
	public Product(String id, String name, int unitPrice) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	//getter, setter 만들기 : 마우스 오른쪽 버튼 > source > generate getters and setters > 전체 지정 후 > generate
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public long getUnitsInStock() {
		return unitsInStock;
	}


	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}

	//마우스 오른쪽 > source > generate hashCode and equals() > 원하는 것 선택 > generate
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	// 마우스 오른쪽 버튼 > source > generate toString > 전체 선택 후 > generate
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInStock=" + unitsInStock
				+ ", condition=" + condition + "]";
	}
	
	
	
	
	
	
}
