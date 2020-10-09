<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Record</title>
<link href = "css1/style2.css" rel = "stylesheet" type = "text/css"/>
</head>

<body style="background-color: #202020">

	<div class="header">
		<ul class="menu1">
			<li class="menu2">Admin</li>
		</ul>
	</div>
	
		<h2 align="center"><font color = "red">Video Details Table</font></h2>
		
		<table>
		
			<tr bgcolor="grey">
				<th>Video Id</th>
				<th>Video name</th>
				<th>Video type</th>
				<th>Video filename</th>
				<th>Trailer filename</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		
		<c:forEach items="${vDetails}" var = "vid">
			
			<c:set var ="id" value="${vid.id}"/>
			<c:set var ="name" value="${vid.name}"/>
			<c:set var ="type" value="${vid.type}"/>
			<c:set var ="filename" value="${vid.filename}"/>
			<c:set var ="trailerfile" value="${vid.trailerfile}"/>
			
			<c:url value="updatevideo.jsp" var="vidupdate">
			
				<c:param name="id" value="${id}"/>
				<c:param name="name" value="${name}"/>
				<c:param name="type" value="${type}"/>
				<c:param name="filename" value="${filename}"/>
				<c:param name="trailerfile" value="${trailerfile}"/>
			
			</c:url>
				
			
			<tr  bgcolor="grey">
				<td>${vid.id}</td>
				<td>${vid.name}</td>
				<td>${vid.type}</td>
				<td>${vid.filename}</td>
				<td>${vid.trailerfile}</td>
				
				<td>
					<a href="${vidupdate}">
					<input type="submit" name="update" value="Edit">
					</a>
				</td>
				<td>
					<form action="deletevideo" method="post">
					<a href="${viddelete}">
					<input type = "hidden" name = "Id" value ="${vid.id}"/>
					<input type="submit" name="delete" value="Delete">
					</a>
					</form>
				</td>
				
			</tr>
			
		</c:forEach>
		
	</table>
	
	<br>
	<a href = "dashboard.jsp">
		<center><input type="submit" name="submit" value="Go to Dashboard"></center>
	</a>
	
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