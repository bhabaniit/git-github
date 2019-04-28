<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Irctc Registration Page</title>
</head>
<body>
	<h1>Welcome to Irctc Registration Page</h1>
	<form:form modelAttribute="irctcForm">
		<table>
			<tr>
				<td>First Name :</td>
				<td><form:input path="fName"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="fName"/>
					</span>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="lName"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="lName"/>
					</span>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:select path="gender">
					<form:option value="" label="select"/>
					<form:option value="male" label="male"/>
					<form:option value="female" label="female"/>
					</form:select>
				</td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="gender"/>
					</span>
				</td>
			</tr>
			<tr>
				<td>Date Of Birth :</td>
				<td><form:input type="date" path="dob"/></td>
			</tr>
			<tr>
				<td>Email Id :</td>
				<td><form:input path="emailId"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="emailId"/>
					</span>
			</tr>
			<tr>
				<td>Mobile Number :</td>
				<td><form:input path="mobileNo"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="mobileNo"/>
					</span>
			</tr>
			<tr>
				<td>Username :</td>
				<td><form:input path="username"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="username"/>
					</span>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="password"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="password"/>
					</span>
			</tr>
			<tr>
				<td>Confirm Password :</td>
				<td><form:password path="confirmPassword"/></td>
				<td colspan="2">
					<span style="color: red">
						<form:errors path="fName"/>
					</span>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>