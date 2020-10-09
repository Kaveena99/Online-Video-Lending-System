<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Update Play list</title>
	<link rel="stylesheet" type="text/css" href="css/style1.css">
</head>

<body>

	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "menu4"  href="logout">Logout</a></li>
			<li class = "menu3"><a class = "menu4"  href="requestform.jsp">Request Videos</a></li>
			<li class = "menu3"><a class = "active1" href="#">User Profile</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>
	
	<h1>Select a video to replace !</h1>

		<%
			String id = request.getParameter("id");
			String username = request.getParameter("username");
		%>

	<form action="update" method="post">
		<table class="table1">
			<tr><th>Trailer</th></tr> 
		
			
				<c:forEach var="v" items="${vDetails}">
					<input type="hidden" name="id" value="<%=id%>">
					<input type="hidden" name="name" value="${v.name}">
					<input type="hidden" name="type" value="${v.type}">
					<input type="hidden" name="filename" value="${v.trailerfile}">
					<input type="hidden" name="username" value="<%=username%>">
					
					<tr>
					<td><embed src="trailers/${v.trailerfile}" showcontrols="true" autostart="false" autoplay="false" ></td>
					
					<td>
						<ul>
							<li>${v.name}<li>
							<li>${v.type}</li>
							<li><input type="submit" name="submit" value="Select" class="btn"></li>
						</ul>
					</td>
					</tr>		
					
				</c:forEach>
			
			
		</table>	
	</form>
	
	<br><br><br><br>
	

</body>
</html>