package com.myEnum;

import com.myEnum._interface.Product;

public enum Game implements Product {
	
	HearthStone(100),DarkSoul(500);
	
	private int price;
	
	private Game(int price) {
		this.setPrice(price);
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
