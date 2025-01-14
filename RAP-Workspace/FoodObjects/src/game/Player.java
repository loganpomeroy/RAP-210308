package game;

import model.FoodItem;

public class Player {
	//inventory variable 
	//array of FoodItem objects 
	private FoodItem[] inventory = new FoodItem[5];
	private int numFoodItems = 0; 

	public FoodItem[] getInventory() {
		return inventory;
	}

	public void setInventory(FoodItem[] inventory) {
		this.inventory = inventory;
	}
	
	public int getNumFoodItems() {
		return this.numFoodItems;
	}
	
	public void addFoodToInventory(FoodItem item) {
		if(numFoodItems < inventory.length) {
			this.inventory[numFoodItems] = item; 
			numFoodItems++; 
		}else {
			System.out.println("Inventory is full!");
		}
	}
	public boolean inventoryIsFull() {
		return numFoodItems >= inventory.length; 
	}
	
	
}
