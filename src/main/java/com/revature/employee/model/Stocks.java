package com.revature.employee.model;

import org.springframework.stereotype.Component;

@Component
public class Stocks {

	private int stock = 100;
	
	public void addStocks(int numberOfStocks) {
		System.out.println("Stock entered Successfully now the stock available is " + (stock + numberOfStocks));
	}
	
	public void removeStocks(int numberStocks) {
		System.out.println("Stock removed successfully and it is entered in the unused/expired products");
		System.out.println("Now the available stocks is " + (stock - numberStocks));
	}
}
