<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<br />
	<h1>Your favorites!</h1>
	<table class="table">
		<tr>
			<th>Event Name </th>
			<th> URL </th>
		</tr>
		<c:forEach var="f" items="${listFavorites}">
		<tr>
			<td> ${f.name } </td>
			<td>${f.url}</td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>