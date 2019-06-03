<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<!-- meta -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">

<!-- css -->
<link rel="stylesheet" href="static/css/bootstrap.min.css">
<link rel="stylesheet" href="static/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="static/css/font-awesome.min.css">
<link rel="stylesheet" href="static/css/main.css">

<!-- google font -->
<link rel='stylesheet'
	href='http://fonts.googleapis.com/css?family=Kreon:300,400,700'>

<!-- js -->
<script src="static/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<script src="static/js/jquery-2.1.3.min.js"></script>
<script src="static/js/jquery.actual.min.js"></script>
<script src="static/js/jquery.scrollTo.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/main.js"></script>

<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<tiles:insertAttribute name="menu" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
</body>
</html>