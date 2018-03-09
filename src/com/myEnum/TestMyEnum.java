package com.myEnum;

import com.myEnum._interface.Product;

public class TestMyEnum {
	
	public static void printPrice(Product product) {
		System.out.println(product.toString() + " " + product.getPrice());;
    }
	
    public static <T extends Enum<T> & Product> void  printPrice(Class<T> clazz) {
        for(Product product : clazz.getEnumConstants()) {
        	printPrice(product);
        }
    }
	
	public static void main(String[] args) {
		printPrice(Food.class);
		printPrice(Game.class);
		printPrice(Game.HearthStone);
	}

}
