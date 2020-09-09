<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
    <p>Your reservation is confirmed successfully. Please, re-check the details.</p>
    First Name : ${reservation.firstName}<br>
    Last Name : ${reservation.lastName}
</body>
</html>