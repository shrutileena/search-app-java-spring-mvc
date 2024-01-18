<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complex Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</head>
<body class="" style="background: #e2e2e2">
	<div class="container mt-4">

		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body py-5">

						<h3 class="text-center text-black">Complex form</h3>

						<form action="handle" class="m-2 p-2" method="post">
							<div class="form-group mt-2">
								<label for="inputName">Your name</label> <input name="name"
									type="text" class="form-control" id="name"
									placeholder="Enter name">
							</div>
							<div class="form-group mt-2">
								<label for="inputId">Your id</label> <input name="id"
									type="text" class="form-control" id="id" placeholder="Enter id">
							</div>
							<div class="form-group mt-2">
								<label for="inputDob">Your DOB</label> <input name="dob"
									type="text" class="form-control" id="dob"
									placeholder="dd/MM/yyyy">
							</div>
							<div class="form-group mt-2">
								<label for="controlSelect">Select Course</label> <select
									name="courses" class="form-control" id="courses" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Spring Framework</option>
									<option>C</option>
									<option>Hibernate</option>
								</select>
							</div>
							<div class="form-group mt-2">
								<span class="mr-3">Select Gender</span>
								<div class="from-check form-check-inline">
									<input class="from-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="from-check form-check-inline">
									<input class="from-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							<div class="form-group mt-2">
								<label for="">Select type</label> <select class="from-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>
							<div class="container mt-5 text-center">
							<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>

					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>