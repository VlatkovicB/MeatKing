<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="special-offser" class="parallax pricing">
	<div class="container inner">
		<h2 class="section-title text-center">Special Offers</h2>
		<p class="lead main text-center">There is no sincerer love than
			the love of food!</p>
		<div class="row">
			<div class="col-md-5 col-md-offset-2">
				<div class="pricing-item">
					<a href="#"><img class="img-responsive img-thumbnail"
						src="<c:url value="${item.image}"/>" alt=""></a>
					<div class="pricing-item-details">
						<h3>
							<a href="<c:url value="${item.id}"/>">${item.name }</a>
						</h3>
						<p>${item.description }</p>
						<a class="btn btn-danger" href="#">Order now</a>
						<div class="clearfix"></div>
					</div>
					<!--price tag-->
					<span class="hot-tag br-red">${item.price }</span>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container -->
</div>
<!-- /#special-offser -->
