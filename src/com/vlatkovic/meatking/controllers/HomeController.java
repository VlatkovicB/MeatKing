package com.vlatkovic.meatking.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vlatkovic.meatking.model.Item;
import com.vlatkovic.meatking.service.ItemService;

@Controller
public class HomeController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}

	@RequestMapping("/food")
	public String foodMenu() {
		return "food";
	}

	@RequestMapping("/reservation")
	public String reservation() {
		return "reservation";
	}

	@RequestMapping("/chefs")
	public String chefs() {
		return "chefs";
	}

	@RequestMapping("/specials")
	public String specials(Model model) {
		List<Item> items = itemService.getAllItems();

		/**
		 * Creates a map with 4 random items from all the items to display as specials
		 */
		if (items.size() >= 4) {
			Map<Long, Item> map = new HashMap<Long, Item>();
			while (map.size() < 4) {
				Item item = items.get((int) (Math.random() * items.size()));

				if (!map.containsKey(item.getId())) {
					map.put(item.getId(), item);
				}
			}
			model.addAttribute("specials", map);
		}

		return "specials";
	}

	@RequestMapping("/facts")
	public String facts() {
		return "facts";
	}
}
