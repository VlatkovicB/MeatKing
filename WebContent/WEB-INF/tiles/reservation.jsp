<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div id="reservation" class="light-wrapper">
	<section class="ss-style-top"></section>
	<div class="container inner">
		<h2 class="section-title text-center">Reservation</h2>
		<p class="lead main text-center">Reserve your table &amp; enjoy
			lorem Ipsum</p>
		<div class="row">
			<div id="error" class="col-md-6">
				<c:url var="action_url" value="/add_reservation" />
				<form:form cssClass="form form-table" commandName="reservation"
					action="${action_url }">
					<div class="form-group">
						<h4>Fill the form for table reservation (all fields required)</h4>
					</div>

					<div class="row">
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="first_name1">first name</label>
							<form:input path="firstName" class="form-control hint"
								type="text" id="first_name1" name="first_name"
								placeholder="First name" required="required" />
							<%-- <form:errors path="firstName" /> --%>
						</div>
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="last_name1">last name</label>
							<form:input path="lastName" cssClass="form-control hint"
								type="text" id="last_name1" name="last_name"
								placeholder="Last name" required="required" />
							<%-- <form:errors path="lastName" /> --%>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="email1">email</label>
							<form:input path="email" cssClass="form-control hint"
								type="email" id="email1" name="email"
								placeholder="Email@domain.com" required="required" />
							<%-- <form:errors path="email" /> --%>
						</div>
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="phone1">phone</label>
							<form:input path="phone" cssClass="form-control hint" type="text"
								id="phone1" name="phone" placeholder="Phone" required="required" />
							<%-- <form:errors path="phone" /> --%>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="reserv_date1">reservation
								date</label>
							<form:input path="date"
								cssClass="form-control datepicker hasDatepicker hint"
								type="text" id="reserv_date1" name="reserv_date"
								placeholder="Reservation date" required="required" />
							<%-- <form:errors path="date" /> --%>
						</div>
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="numb_guests1">number of
								guests</label>
							<form:input path="numberOfGuests" cssClass="form-control hint"
								type="text" id="numb_guests1" name="numb_guests"
								placeholder="Number of guests" required="required" />
							<%-- <form:errors path="numberOfGuests" /> --%>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="alt_reserv_date1">time from</label>
							<form:input path="timeFrom"
								cssClass="form-control datepicker hasDatepicker hint"
								type="text" id="alt_reserv_date1" name="alt_reserv_date"
								placeholder="Time from" required="required" />
							<%-- <form:errors path="timeFrom" /> --%>
						</div>
						<div class="col-lg-6 col-md-6 form-group">
							<label class="sr-only" for="time1">time</label>
							<form:input path="timeTo"
								cssClass="form-control timepicker ui-timepicker-input hint"
								type="text" id="time1" name="time" placeholder="Time to"
								required="" autocomplete="off" />
							<%-- <form:errors path="timeTo" /> --%>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud exercitation
								ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
								aute irure dolor in reprehenderit in voluptate velit esse.</p>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-12 col-md-12">
							<button type="submit" onclick="return validate()"
								class="btn btn-danger btn-lg">Reserve!</button>
						</div>
					</div>
				</form:form>
			</div>
			<!-- col-md-6 -->
			<div class="col-md-5 col-md-offset-1">

				<h3>
					<i class="fa fa-clock-o fa-fw"></i>Hours
				</h3>
				<h4>Breakfast</h4>
				<p>
					Mon to Fri: 7:30 AM - 11:30 AM<br>Sat &amp; Sun: 8:00 AM -
					9:00 AM
				</p>
				<h4>Lunch</h4>
				<p>Mon to Fri: 12:00 PM - 5:00 PM</p>
				<h4>Dinner</h4>
				<p>
					Mon to Sat: 6:00 PM - 1:00 AM<br>Sun: 5:30 PM - 12:00 AM
				</p>

				<h3>
					<i class="fa fa-map-marker fa-fw"></i>Directions
				</h3>
				<p>4120 Lenox Avenue, New York, NY, 10035 76 Saint Nicholas
					Avenue</p>

				<h3>
					<i class="fa fa-mobile fa-fw"></i>Contacts
				</h3>
				<p>
					Email: <a href="mailto:yourname@meatking.com">yourname@meatking.com</a>
				</p>
				<p>Phone: +234 3456 678</p>

			</div>
			<!-- col-md-6 -->
		</div>
		<!-- /.services -->
	</div>
	<!-- /.container -->
</div>
<!-- #reservation -->
