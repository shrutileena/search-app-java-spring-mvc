<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<%-- <%	String name = (String) request.getParameter("name");
	Long id = Long.parseLong(request.getParameter("id"));
	Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dob"));
	String gender = (String) request.getParameter("gender");
	String type = (String) request.getParameter("type");
	String courses =  (String) request.getParameter("courses");
	//List<String> courses =  (List<String>) request.getParameter("courses");
	String street = (String) request.getParameter("address.street");
	String city = (String) request.getParameter("address.city");
%>
<h1><%= name+" "+id+" "+dob+" "+gender+" "+type+" "+street+" "+city+" "+courses %></h1>
<h1>Hello</h1> --%>
<h1>${student.name }</h1>
<h1>${student.id }</h1>
<h1>${student.dob }</h1>
<h1>${student.courses }</h1>
<h1>${student.gender }</h1>
<h1>${student.type }</h1>
<h1>${student.address.street }</h1>
<h1>${student.address.city }</h1>
</body>
</html>