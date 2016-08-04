<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<h2>Congratulation! Registration For Engineering Course Is Completed Successfully</h2>
	<h3>Details Submitted are: </h3>
	<table>
		<tr>
			<td>Student Name: </td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student Course: </td>
			<td>${student.studentCourse}</td>
		</tr>	
	</table>
</body>
</html>