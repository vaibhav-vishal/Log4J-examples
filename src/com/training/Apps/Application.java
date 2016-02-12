package com.training.Apps;

import org.apache.log4j.Logger;

//import java.util.logging.Logger;

import com.training.domain.FoodItems;
import com.training.domain.Resturant;

public class Application {

	public static void main(String[] args) {
		Logger log = Logger.getRootLogger();
		Resturant resturant = new Resturant();
		resturant.init();
		log.info("Resturant Initialized");
		System.out.println("Menu Card\n"+resturant.getMenuCard());
	System.out.println("Veg Items \n"+resturant.getItems("veg"));
	System.out.println("Non-Veg Items \n"+resturant.getItems("nonveg"));
		}

}
