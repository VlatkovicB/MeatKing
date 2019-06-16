package com.vlatkovic.meatking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Reservation implements Serializable {

	private static final long serialVersionUID = -208137368091622265L;
	@Id
	@GeneratedValue
	private int id;
	@NotNull(message = "You must enter your first name.")
	private String firstName;
	@NotNull(message = "You must enter your last name.")
	private String lastName;
	@NotNull
	@Pattern(regexp = ".*\\@.*\\..*", message = "Enter a valid email address.")
	private String email;
//	@Size(min = 9, max = 13)
	private String phone;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	@Min(value = 1, message = "You must reserve for at least 1 person.")
	private int numberOfGuests;
	@Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$", message = "Enter time in hh:mm format.")
	private String timeFrom;
	@Pattern(regexp = "^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$", message = "Enter time in hh:mm format.")
	private String timeTo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {

		this.date = date;
	}

	public String getTimeFrom() {
		return timeFrom;
	}

	public void setTimeFrom(String timeFrom) {
		this.timeFrom = timeFrom;
	}

	public String getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(String timeTo) {
		this.timeTo = timeTo;
	}

}
