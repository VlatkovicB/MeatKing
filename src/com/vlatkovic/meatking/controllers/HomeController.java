package com.vlatkovic.meatking.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vlatkovic.meatking.model.Item;
import com.vlatkovic.meatking.model.Reservation;
import com.vlatkovic.meatking.service.ItemService;
import com.vlatkovic.meatking.service.ReservationService;

@Controller
public class HomeController {

	@Autowired
	private ItemService itemService;
	@Autowired
	private ReservationService reservationService;

	@ModelAttribute("reservation")
	public Reservation constructReservation() {
		return new Reservation();
	}

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

	@RequestMapping(value = "/add_reservation", method = RequestMethod.POST)
	public String submitReservation(@Valid @ModelAttribute("reservation") Reservation reservation,
			BindingResult result) {

		if (!result.hasErrors()) {
			reservationService.saveOrUpdate(reservation);
			return "redirect:reservation";
		}

		for (Object object : result.getAllErrors()) {
			if (object instanceof FieldError) {
				FieldError fieldError = (FieldError) object;

				System.out.println(fieldError.getCode());
			}
			if (object instanceof ObjectError) {
				ObjectError objectError = (ObjectError) object;

				System.out.println(objectError.getCode());
			}
		}
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
