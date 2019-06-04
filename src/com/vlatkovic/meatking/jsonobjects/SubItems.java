package com.vlatkovic.meatking.jsonobjects;

import com.google.gson.annotations.SerializedName;

public class SubItems {

	private int id;
	private String name;
	private int position;
	private double price;
	private String consumable;
	@SerializedName("cuisine_name")
	private String cuisineName;
	@SerializedName("category_name")
	private String categoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getConsumable() {
		return consumable;
	}

	public void setConsumable(String consumable) {
		this.consumable = consumable;
	}

	public String getCuisineName() {
		return cuisineName;
	}

	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
