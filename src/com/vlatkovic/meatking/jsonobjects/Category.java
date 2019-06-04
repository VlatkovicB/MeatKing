package com.vlatkovic.meatking.jsonobjects;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Category {

	private int id;
	private String name;
	private int position;
	@SerializedName("menu-items")
	private List<MenuItems> menuItems;

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

	public List<MenuItems> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItems> menuItems) {
		this.menuItems = menuItems;
	}

}
