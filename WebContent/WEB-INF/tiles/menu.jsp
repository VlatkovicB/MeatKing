<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

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
			<a class="navbar-brand" href="#"><h2>Meat King</h2></a>
		</div>
		<!-- navbar-header -->
		<div id="navbar" class="navbar-collapse collapse">
			<div class="hidden-xs" id="logo">
				<a href="#header"> <img src="static/img/logo.png" alt="">
				</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#story">Story</a></li>
				<li><a href="#reservation">Reservation</a></li>
				<li><a href="#chefs">Our Chefs</a></li>


				<li><a href="#facts">Facts</a></li>
				<li><a href="#food-menu">Food Menu</a></li>
				<li><a href="#special-offser">Special Offers</a></li>

				<!--fix for scroll spy active menu element-->
				<li style="display: none;"><a href="#header"></a></li>
			</ul>
		</div>
		<!--/.navbar-collapse -->
	</div>
	<!-- container -->
</div>
<!-- menu -->