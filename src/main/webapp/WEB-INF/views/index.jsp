<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th> Name </th>
			<th> Type </th>
			<th> Id </th>
		</tr>
		<c:forEach var="e" items="${events}">
		<tr>
			<td> ${e.name } </td>
			<td> ${e.type } </td>
			<td> ${e.id } </td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>