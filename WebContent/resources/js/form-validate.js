function validate() {
	var $focus = $('#error');
	var $firstName = $("#first_name1").val();
	var $lastName = $("#last_name1").val();
	var $email = $("#email1").val();
	var $phone = $("#phone1").val();
	var $reservationDate = $("#reserv_date1").val();
	var $numberOfGuests = $("#numb_guests1").val();
	var $timeFrom = $("#alt_reserv_date1").val();
	var $timeTo = $("#time1").val();

	return (validateFirstnName($firstName) && valdiateLastName($lastName)
			&& validateEmail($email) && validatePhone($phone)
			&& validateReservationDate($reservationDate)
			&& validateNumberOfGuests($numberOfGuests)
			&& validateTimeFrom($timeFrom) && validateTimeTo($timeTo));
}

function validateFirstnName(firstName) {
	if (firstName == null || firstName == "") {
		alert("Enter First Name.");
		return false;
	}
	return true;

}
function valdiateLastName(lastName) {
	if (lastName == null || lastName == "") {
		alert("Enter Last Name.");
		return false;
	}
	return true;

}
function validateEmail(email) {
	var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
	var isEmail = re.test(email);

	if (!isEmail) {
		alert("Enter proper email address.");
		return false;
	}

	return isEmail;
}
function validatePhone(phone) {
	if (phone.length < 8 || phone.length > 13) {
		alert("Phone number must be between 8 and 13 characters long.");
		return false;
	}
	return true;

}
function validateNumberOfGuests(numberOfGuests) {
	if (numberOfGuests < 1) {
		alert("You must reserve for at least 1 guest.");
		return false;
	}
	return true;

}
function validateReservationDate(reservationDate) {
	// First check for the pattern
	if (!/^\d{1,2}\/\d{1,2}\/\d{4}$/.test(reservationDate)) {
		alert("Enter proper date(dd/mm/yyyy");
		return false;
	}

	// Parse the date parts to integers
	var parts = reservationDate.split("/");
	var day = parseInt(parts[1], 10);
	var month = parseInt(parts[0], 10);
	var year = parseInt(parts[2], 10);

	// Check the ranges of month and year
	if (year < 1000 || year > 3000 || month == 0 || month > 12) {
		alert("Enter proper date(dd/mm/yyyy");
		return false;
	}

	var monthLength = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];

	// Adjust for leap years
	if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		monthLength[1] = 29;

	// Check the range of the day
	var isDay = day > 0 && day <= monthLength[month - 1];

	if (!isDay) {
		alert("Enter proper date(dd/mm/yyyy");
		return false;
	}
	return isDay;
}

function validateTimeFrom(timeFrom) {
	if (timeFrom == null || timeFrom == "") {
		alert("Insert time you want to reserve.");
		return false;
	}

	var re = /^([0-1]?[0-9]|2[0-4]):([0-5][0-9])(:[0-5][0-9])?$/;
	var isValid = re.test(timeFrom);

	if (!isValid) {
		alert("Insert time in proper format. (hh:mm)");
		return false
	}

	return isValid;
}

function validateTimeTo(timeTo) {
	if (timeTo == null || timeTo == "") {
		alert("Insert time you want to reserve to.");
		return false;
	}

	var re = /^([0-1]?[0-9]|2[0-4]):([0-5][0-9])(:[0-5][0-9])?$/;
	var isValid = re.test(timeTo);

	if (!isValid) {
		alert("Insert time in proper format. (hh:mm)");
		return false
	}

	return isValid;
}
