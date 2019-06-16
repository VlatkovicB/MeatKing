package com.vlatkovic.meatking.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	/**
	 * If it doesnt have erros, saves reservation - otherwise displays errors in
	 * console.
	 * 
	 * @param reservation
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/add_reservation", method = RequestMethod.POST)
	public String submitReservation(@Valid @ModelAttribute("reservation") Reservation reservation,
			BindingResult result) {

		if (!result.hasErrors()) {
			reservationService.saveOrUpdate(reservation);
			return "redirect:reservation";
		}

		for (ObjectError object : result.getAllErrors()) {
			System.out.println(object.getDefaultMessage());
		}
		return "reservation";
	}

	@RequestMapping("/chefs")
	public String chefs() {
		return "chefs";
	}

	@RequestMapping("/specials")
	public String specials(Model model) {
		List<Item> specials = itemService.getAllSpecials();

		/**
		 * Creates a map with 4 random items from all the specials to display.
		 */
		Map<Integer, Item> map = new HashMap<Integer, Item>();
		if (specials.size() >= 4) {
			while (map.size() < 4) {
				Item item = specials.get((int) (Math.random() * specials.size()));

				if (!map.containsKey(item.getId())) {
					map.put(item.getId(), item);
				}
			}
		}
		model.addAttribute("specials", map);

		return "specials";
	}

	@RequestMapping("/{id}")
	public String specialDetails(Model model, @PathVariable int id) {
		model.addAttribute("item", itemService.getItem(id));
		return "specials-detail";
	}

	@RequestMapping("/facts")
	public String facts() {
		return "facts";
	}
}
