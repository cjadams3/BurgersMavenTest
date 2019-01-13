package model;

public class BurgerCalc {
	
	public double OrderTotal(Burger burger) {
		return (burger.getNumberSold() * burger.getBurgerPrice());
	}
	
	public double OrderProfit(Burger burger) {
		return (burger.getNumberSold() * (burger.getBurgerPrice() - burger.getBurgerCost()));
	}
	
	public double ProfitPerBurger(Burger burger) {
		return (burger.getBurgerPrice() - burger.getBurgerCost()); 
	}
}
