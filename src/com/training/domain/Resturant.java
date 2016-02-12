package com.training.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Resturant {
	private List<FoodItems> items;
	Logger log = Logger.getRootLogger();
	public Resturant() {
		items = new ArrayList<FoodItems>();
	}

	public void init() {
		FoodItems foodItem1 = new FoodItems(1001, "tea", 20, true);
		FoodItems foodItem2 = new FoodItems(1002, "coffee", 25, true);
		FoodItems foodItem3 = new FoodItems(1003, "Pasta", 80, true);
		FoodItems foodItem4 = new FoodItems(1004, "Butter Naan", 30, true);
		FoodItems foodItem5 = new FoodItems(1005, "Chicken Masala", 120, false);
		FoodItems foodItem6 = new FoodItems(1006, "Fish Curry", 90, false);
		FoodItems foodItem7 = new FoodItems(1007, "Chicken Soup", 50, false);
		FoodItems foodItem8 = new FoodItems(1008, "Chicken Biryani", 140, false);
		items.add(foodItem1);
		items.add(foodItem2);
		items.add(foodItem3);
		items.add(foodItem4);
		items.add(foodItem5);
		items.add(foodItem6);
		items.add(foodItem7);
		items.add(foodItem8);
		log.info("items added");
	}

	public List<FoodItems> getItems(String type) {
		List<FoodItems> foodItems = new ArrayList<FoodItems>();
		for (FoodItems foodItems2 : items) {
			if (type == "nonveg") {
				if (!foodItems2.isIsvegetarian()) {
					foodItems.add(foodItems2);
				}
			} else if (foodItems2.isIsvegetarian())
				foodItems.add(foodItems2);
		}
		return foodItems;
	}

	public List<FoodItems> getMenuCard() {
		return items;

	}
}
