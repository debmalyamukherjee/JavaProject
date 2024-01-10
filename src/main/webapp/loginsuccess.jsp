<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Controller.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Model.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
 <jsp:include page="./header1.jsp"></jsp:include>
	<h1>Login Success!!</h1>
	<a href="https://courses.telusko.com/">Click here to get all the
		information about Course Details..</a>

	<div class="container">

		<h2>Displaying All User Data:</h2>
		<div class="col-md-5 col-md-offset-3">

			<form action="./FetchData">
			<input type="submit" value="Get All Record">
			<%--	<table border="1">
					<tr>
						<td>Name:</td>
						<td>Course:</td>
						<td>Country:</td>
					</tr>
					<%Model ob = new Model();
					ob.select();
					%>
					<tr>
						<td><% ob.getName(); %></td>
						<td><% ob.getCourse(); %></td>
						<td><% ob.getCountry(); %></td>
					</tr>
				</table>--%>
		
			</form>
		</div>
	</div>
	        <jsp:include page="./footer.jsp"></jsp:include>
	
</body>
</html>