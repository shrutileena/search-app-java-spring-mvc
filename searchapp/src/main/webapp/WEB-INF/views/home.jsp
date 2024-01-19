<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home - Search</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>

<link href="<c:url value="/resources/css/style.css"></c:url>">
<script src="<c:url value="/resources/js/script.js"></c:url>"></script>

</head>
<body>
	<img alt="image" src='<c:url value="/resources/image/java2.jpg"></c:url>'>
	<div class="container">
		<div class="card mx-auto mt-5 bg-secondary" style="width: 80%;">
			<div class="card-body py-5">

				<h3 class="text-center text-white">My Search</h3>

				<form action="search" class="mt-5">
					<div class="form-group">
						<input type="text" name="querybox"
							placeholder="Enter your keyword" class="form-control">
					</div>
					<div class="container text-center mt-3">
						<button class="btn btn-outline-light">Search</button>
					</div>
				</form>

			</div>
		</div>
	</div>
</body>
</html>