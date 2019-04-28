<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Users</title>
</head>
<body>
	<h1>List of Registered Irctc users</h1>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Date Of Birth</th>
			<th>Email Id</th>
			<th>Username</th>
			<th>Mobile No</th>
		</tr>
		
		<c:forEach items="${users}" var="users">
			<tr>
				<td>${users.firstName}</td>
				<td>${users.lastName}</td>
				<td>${users.dateOfBirth}</td>
				<td>${users.emailId}</td>
				<td>${users.username}</td>
				<td>${users.mobileNo}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>