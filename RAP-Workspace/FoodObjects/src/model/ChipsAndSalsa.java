package model;

public class ChipsAndSalsa extends FoodItem{
	//THIS IS INHERITED ___ DONT SHADOW IT OR HIDE IT 
	//double cost;
	
	public String getName() {
		return super.getName()+" CHIPS AND SALSA";
	}
	
	
	
	@Override
	public String toString() {
		return "ChipsAndSalsa [name=" + name + ", cost=" + cost + "]";
	}



	@Override
	public void printStuff() {
		System.out.println("Work!");
	}
	
}
