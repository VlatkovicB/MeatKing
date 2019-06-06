package com.vlatkovic.meatking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vlatkovic.meatking.dao.ReservationDao;
import com.vlatkovic.meatking.model.Reservation;

@Service
@Transactional
public class ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	public void saveOrUpdate(Reservation reservation) {
		reservationDao.saveOrUpdate(reservation);
	}

}
