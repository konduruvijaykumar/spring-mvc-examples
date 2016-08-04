<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
<h1>Student Admission Form For Engineering Courses</h1>
<table>
<tr><td><form:errors path="studentInfo.*"/><!-- <form:errors path="studentInfo.*" cssStyle="color: red"/> --></td></tr>
</table>
<form action="<%=application.getContextPath()%>/springmvc/control62" method="post">
	<table>
		<tr>
			<td>Student Name: </td>
			<td><input type="text" name="studentName"><!-- <input type="text" name="studentName" value="${studentInfo.studentName}"> --></td>
		</tr>
		<tr>
			<td>Student Course: </td>
			<td><input type="text" name="studentCourse"><!-- <input type="text" name="studentCourse" value="${studentInfo.studentCourse}"> --></td>
		</tr>
		<tr>
			<td>Student Mobile: </td>
			<td><input type="text" name="studentMobile"><!-- <input type="text" name="studentMobile" value="${studentInfo.studentMobile}"> --></td>
		</tr>
		<tr>
			<td>Student DOB: </td>
			<td><input type="text" name="studentDOB"><!-- <input type="text" name="studentDOB" value="${studentInfo.studentDOB}"> --></td>
		</tr>
		<tr>
			<td>Student Skills: </td>
			<td>
				<select name="studentSkills" multiple="multiple">
					<option value="Java">Java</option>
					<option value="Spring">Spring</option>
					<option value="Struts 2">Struts 2</option>
				</select>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td colspan="4">Student Address: </td>
		</tr>
		<tr>
			<td>Street: <input type="text" name="studentAddress.street"><!-- <input type="text" name="studentAddress.street" value="${studentInfo.studentAddress.street}"> --></td>
			<td>City: <input type="text" name="studentAddress.city"><!-- <input type="text" name="studentAddress.city" value="${studentInfo.studentAddress.city}"> --></td>
			<td>Country: <input type="text" name="studentAddress.country"><!-- <input type="text" name="studentAddress.country" value="${studentInfo.studentAddress.country}"> --></td>
			<td>Pin Code: <input type="text" name="studentAddress.pincode"><!-- <input type="text" name="studentAddress.pincode" value="${studentInfo.studentAddress.pincode}"> --></td>
		</tr>
	</table>
	<input type="submit" value="Click to submit">
</form>
</body>
</html>
