<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Play List</title>
	<link rel="stylesheet" type="text/css" href="css/style4.css">
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

	<h1>Play List</h1>
	
	
	<table class="table1">
		<c:forEach var="p" items="${pDetails}">
			
				<c:set var="id" value="${p.id}"/>
				<c:set var="name" value="${p.name}"/>
				<c:set var="type" value="${p.type}"/>
				<c:set var="filename" value="${p.filename}"/>
				<%String username = request.getParameter("username");%>
				<c:set var="username" value="<%=username%>"/>
				
				<c:url value="searchForUpdate.jsp" var="playlistupdate">
					<c:param name="id" value="${id}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="type" value="${type}"/>
					<c:param name="filename" value="${filename}"/>
					<c:param name="username" value="${username}"/>
				</c:url>
			
			 <tr>
				<td >${p.name}</td>
				<td>${p.type}</td>
				<td>
					<form action="play" method="post">
						<input type="hidden" name="name" value="${p.name}"/>
						<input type="submit" name="submit" value="Play" class="btn">
					</form>
				</td>
				<td>
					<a href="${playlistupdate}">
						<input type="submit" name="submit" value="Change video" class="btn">
					</a>
				</td>
				<td>
					<form action="delete" method="post">
						<input type="hidden" name="id" value="${p.id}"/>
						<input type="hidden" name="username" value="<%=username%>"/>
						<input type="submit" name="submit" value="Delete" class="btn">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table><br><br><br><br>
	
	<footer>
			<div class = "footer">
				<br>
				<img src="images/Logo1.png" class="logo1">
				<img src="images/Logo2.png" class="logo2">
				<img src="images/Logo3.png" class="logo3">
				<img src="images/Logo4.png" class="logo4">
				<img src="images/Logo5.png" class="logo5">
				<img src="images/Logo6.png" class="logo6">
				<p class="p2">Contact Number: 0112247859</p><br>
				<p class="p2"> All rights reserved @2020,WatchIt team</p>
			</div>
	</footer>

</body>
</html>