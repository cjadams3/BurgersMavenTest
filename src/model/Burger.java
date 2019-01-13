package model;

public class Burger {
	private String burgerName;
	private int numberSold;
	private double burgerCost;
	private double burgerPrice;
	
	public Burger() {
		
	}
	
	public Burger(String burgerName, int numberSold, double burgerCost, double burgerPrice) {
		this.burgerName = burgerName;
		this.numberSold = numberSold;
		this.burgerCost = burgerCost;
		this.burgerPrice = burgerPrice;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}
	public int getNumberSold() {
		return numberSold;
	}
	public void setNumberSold(int numberSold) {
		this.numberSold = numberSold;
	}
	public double getBurgerCost() {
		return burgerCost;
	}
	public void setBurgerCost(double burgerCost) {
		this.burgerCost = burgerCost;
	}
	public double getBurgerPrice() {
		return burgerPrice;
	}
	public void setBurgerPrice(double burgerPrice) {
		this.burgerPrice = burgerPrice;
	}
	
	
	
}
