package com.vlatkovic.meatking.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vlatkovic.meatking.model.Item;

@Repository
@Transactional
public class ItemDao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session session() {
		return sessionFactory.getCurrentSession();
	}

	/*********** Create or Update ***********/
	public void saveOrUpdateItem(Item item) {
		session().saveOrUpdate(item);
	}

	/*********** Read ***********/
	public Item getItem(int id) {
		Criteria crit = session().createCriteria(Item.class);
		crit.add(Restrictions.idEq(id));
		return (Item) crit.uniqueResult();
	}

	/*********** Delete ***********/
	public void deleteItem(int id) {
		Query query = session().createQuery("DELETE FROM Item WHERE id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	/*********** Get All Items ***********/
	@SuppressWarnings("unchecked")
	public List<Item> getAllItems() {
		Criteria crit = session().createCriteria(Item.class);
		return crit.list();
	}

}
