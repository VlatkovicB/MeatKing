package com.vlatkovic.meatking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vlatkovic.meatking.dao.ItemDao;
import com.vlatkovic.meatking.model.Item;

@Service
@Transactional
public class ItemService {

	@Autowired
	private ItemDao itemDao;

	/*********** Create or Update ***********/
	public void saveOrUpdateItem(Item item) {
		itemDao.saveOrUpdateItem(item);
	}

	/*********** Read ***********/
	public Item getItem(int id) {
		return itemDao.getItem(id);
	}

	/*********** Delete ***********/
	public void deleteItem(int id) {
		itemDao.deleteItem(id);
	}

	/*********** Get All Items ***********/
	public List<Item> getAllItems() {
		return itemDao.getAllItems();
	}
}
