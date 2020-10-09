<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Play Video</title>
	<link rel="stylesheet" type="text/css" href="css/style5.css">
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
	
	
	<c:forEach var="pl" items="${plDetails}">
		<center>
			<h1>${pl.name}</h1><br><br>
			
			<div class="div1">
			<video src="videos/${pl.filename}" width="800" height="800" controls></video>
			</div>
		</center>
	</c:forEach>

</body>
</html>