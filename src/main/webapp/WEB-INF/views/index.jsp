<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<input class="btn btn-primary" type="submit" value="Check your favorite"><br />
	<br />
	<table class="table">
		<tr>
			<th> Name </th>
			<th> Type </th>
			<th>Favorite</th>
		</tr>
		<c:forEach var="e" items="${events}">
		<tr>
			<td><a href="${e.url}">${e.name }</a></td>
			<td> ${e.type } </td>
			<td><a class="btn btn-primary" href="favorite?id=${e.id}">Add</a></td>
			
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>