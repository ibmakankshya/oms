package com.ibm.demo.entity;

import javax.validation.constraints.NotNull;

public class Order {
	@NotNull
	
	private String item;
	private int price;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<=0) {
		throw new IllegalArgumentException("Price is negative");
		}
		this.price = price;
	}

}
