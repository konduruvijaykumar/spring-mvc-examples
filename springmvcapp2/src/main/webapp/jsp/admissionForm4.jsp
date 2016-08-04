<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
<h1>Student Admission Form For Engineering Courses</h1>
<!-- http://stackoverflow.com/questions/4764405/how-to-use-relative-paths-without-including-the-context-root-name, 
		http://stackoverflow.com/questions/10327390/how-should-i-get-root-folder-path-in-jsp-page,
		http://stackoverflow.com/questions/2204870/how-to-get-domain-url-and-application-name,
		http://stackoverflow.com/questions/16675191/get-full-url-and-query-string-in-servlet-for-both-http-and-https-requests -->
<form action="<%=application.getContextPath()%>/control41" method="post">
<%-- <form action="${pageContext.request.contextPath}/springmvc/control42" method="post"> --%>
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