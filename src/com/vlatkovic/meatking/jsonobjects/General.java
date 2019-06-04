package com.vlatkovic.meatking.jsonobjects;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class General {

	private String type;
	@SerializedName("restaurant-info")
	private RestaurantInfo restaurantInfo;
	@SerializedName("restaurant-time-info")
	private RestaurantTimeInfo restaurantTimeInfo;
	private String today;
	@SerializedName("working-hours-start")
	private String working_hours_start;
	@SerializedName("working-hours-end")
	private String working_hours_end;
	private List<Category> categorys;
	private List<Deals> deals;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RestaurantInfo getRestaurant_info() {
		return restaurantInfo;
	}

	public void setRestaurant_info(RestaurantInfo restaurant_info) {
		this.restaurantInfo = restaurant_info;
	}

	public RestaurantTimeInfo getRestaurant_time_info() {
		return restaurantTimeInfo;
	}

	public void setRestaurant_time_info(RestaurantTimeInfo restaurant_time_info) {
		this.restaurantTimeInfo = restaurant_time_info;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getWorking_hours_start() {
		return working_hours_start;
	}

	public void setWorking_hours_start(String working_hours_start) {
		this.working_hours_start = working_hours_start;
	}

	public String getWorking_hours_end() {
		return working_hours_end;
	}

	public void setWorking_hours_end(String working_hours_end) {
		this.working_hours_end = working_hours_end;
	}

	public List<Category> getCategorys() {
		return categorys;
	}

	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}

	public List<Deals> getDeals() {
		return deals;
	}

	public void setDeals(List<Deals> deals) {
		this.deals = deals;
	}

}
