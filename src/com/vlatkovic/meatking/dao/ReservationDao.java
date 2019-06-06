package com.vlatkovic.meatking.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vlatkovic.meatking.model.Reservation;

@Repository
@Transactional
public class ReservationDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session() {
		return sessionFactory.getCurrentSession();
	}

	/*********** Create or Update ***********/
	public void saveOrUpdate(Reservation reservation) {
		session().saveOrUpdate(reservation);
	}
	/*********** Read ***********/
	/*********** Delete ***********/
	/*********** Get All Reservations ***********/
}
