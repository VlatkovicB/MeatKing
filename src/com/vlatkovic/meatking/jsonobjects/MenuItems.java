package com.vlatkovic.meatking.jsonobjects;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class MenuItems {
	private int id;
	private String name;
	private int position;
	private String description;
	private List<String> images;
	@SerializedName("sub-items")
	private List<SubItems> sub_items;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public List<SubItems> getSub_items() {
		return sub_items;
	}

	public void setSub_items(List<SubItems> sub_items) {
		this.sub_items = sub_items;
	}

}
