<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h1>Congratulation! Registration For Engineering Course Is Completed Successfully</h1>
	<h2>Details Submitted are: </h2>
	<table>
		<tr>
			<td>Student Name: </td>
			<td>${studentInfo.studentName}</td>
		</tr>
		<tr>
			<td>Student Course: </td>
			<td>${studentInfo.studentCourse}</td>
		</tr>
		<tr>
			<td>Student Mobile: </td>
			<td>${studentInfo.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB: </td>
			<td>${studentInfo.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills: </td>
			<td>${studentInfo.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Address: </td>
			<td>
				Street: ${studentInfo.studentAddress.street}
				City: ${studentInfo.studentAddress.city}
				Country: ${studentInfo.studentAddress.country}
				Pin Code: ${studentInfo.studentAddress.pincode}
			</td>
		</tr>
	</table>
</body>
</html>
