<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Feedback</title>
</head>
<body>


<h1 style="color:blue">List of Feedback</h1>


<table border="1">
				<tr>
					<th>Name</th>
					<th>Title</th>
					<th>Feedback</th>
				</tr>
				
		<c:forEach items="${fd}" var="feeds">

				<tr>
				<td>${feeds.uname}</td>
		<td>${feeds.title}</td>
		<td>${feeds.feedback}</td>
				</tr>
			
	
			
		</c:forEach>
	
	</table>	
		
<a href="addfeeds">Submit another feedback</a>

</body>
</html>