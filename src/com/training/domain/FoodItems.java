package com.training.domain;

import org.apache.log4j.Logger;

public class FoodItems {
	private int itemCode;
	private String itemName;
	private double ratePerUnit;
	private boolean isvegetarian;
	Logger log = Logger.getRootLogger();
	public int getItemCode() {
		return itemCode;
	}

	public FoodItems(int itemCode, String itemName, double ratePerUnit, boolean isvegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.isvegetarian = isvegetarian;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public boolean isIsvegetarian() {
		return isvegetarian;
	}

	public void setIsvegetarian(boolean isvegetarian) {
		this.isvegetarian = isvegetarian;
	}

	@Override
	public String toString() {
		return "[itemCode=" + itemCode + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit + "]\n";
	}

}
