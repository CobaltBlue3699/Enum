package com.myEnum;

import com.myEnum._interface.Product;

public enum Food implements Product {
	
	Sandwich(100),Noodle(12){
		@Override
		public int getPrice() {
			return super.getPrice() + 1;
		}
	};
	
	private int price;
	
	private Food(int price) {
		this.setPrice(price);
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
