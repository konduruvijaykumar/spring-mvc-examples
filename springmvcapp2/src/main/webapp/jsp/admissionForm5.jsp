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
<h2>Student Admission Form For Engineering Courses</h2>
<form action="<%=application.getContextPath()%>/springmvc/control53" method="post">
	<p>
		Student Name: <input type="text" name="studentName">
	</p>
	<p>
		Student Course: <input type="text" name="studentCourse">
	</p>
	<input type="submit" value="Click to submit">
</form>
</body>
</html>
