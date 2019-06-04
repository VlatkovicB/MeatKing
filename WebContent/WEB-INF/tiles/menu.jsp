<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="menu" class="navbar navbar-inverse navbar-fixed-top"
	role="navigation">
	<div class="container">
		<div class="navbar-header visible-xs">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Meat King</a>
		</div>
		<!-- navbar-header -->
		<div id="navbar" class="navbar-collapse collapse">
			<div class="hidden-xs" id="logo">
				<a href="<c:url value='/home'/>"> <img src="static/img/logo.png"
					alt="">
				</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="<c:url value='/home'/>">Story</a></li>
				<li><a href="<c:url value='/reservation'/>">Reservation</a></li>
				<li><a href="<c:url value='/chefs'/>">Our Chefs</a></li>


				<li><a href="<c:url value='/facts'/>">Facts</a></li>
				<li><a href="<c:url value='/food'/>">Food Menu</a></li>
				<li><a href="<c:url value='/specials'/>">Special Offers</a></li>

				<!--fix for scroll spy active menu element-->
				<li style="display: none;"><a href="#story"></a></li>
			</ul>
		</div>
		<!--/.navbar-collapse -->
	</div>
	<!-- container -->
</div>
<!-- menu -->