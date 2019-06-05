package com.vlatkovic.meatking.service;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.vlatkovic.meatking.jsonobjects.Category;
import com.vlatkovic.meatking.jsonobjects.General;
import com.vlatkovic.meatking.jsonobjects.MenuItems;
import com.vlatkovic.meatking.model.Item;

@Service
@Transactional
public class InitDBService {

	@Autowired
	private ItemService itemService;

	/**
	 * Fills database with data from General object
	 */
	@PostConstruct
	public void init() {
		General general = populateGeneralFromJson();

		if (general != null) {
			for (Category cat : general.getCategorys()) {
				for (MenuItems menuItem : cat.getMenuItems()) {
					Item item = new Item();
					item.setName(menuItem.getName());
					item.setDescription(menuItem.getDescription());
					item.setPrice(menuItem.getSub_items().get(0).getPrice());

					itemService.saveOrUpdateItem(item);
				}
			}
		}
	}

	/**
	 * Populates General object from example Json found online just to have some
	 * data.
	 * 
	 * @return
	 */
	private General populateGeneralFromJson() {
		General general = null;
		Scanner scan = null;
		String json = null;
		try {
			URL url = new URL(
					"https://gist.githubusercontent.com/VlatkovicB/6fb7a75d018db8207b888f1e9735f097/raw/80e5f36ecf0a3b04db6a83fe5921e54a08f43dda/restaurant_menu.json");
			scan = new Scanner(url.openStream(), "UTF-8");
			json = scan.useDelimiter("\\A").next();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

		Gson gson = new Gson();
		general = gson.fromJson(json, General.class);

		return general;
	}

}
