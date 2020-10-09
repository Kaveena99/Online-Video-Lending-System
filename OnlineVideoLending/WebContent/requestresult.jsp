<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Requested Details</title>
	<link rel="stylesheet" href="style/requestresult.css" type="text/css">
</head>

<body class="body">

	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "menu4"  href="logout">Logout</a></li>
			<li class = "menu3"><a class = "active1"  href="requestform.jsp">Request Videos</a></li>
			<li class = "menu3"><a class = "menu4" href="#">User Profile</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>
	
	
	
	<div class="tableon">
		<h2>Requested Details</h2><br>
		
		<table >
			<tr bgcolor = "lightblue">
				<th>Request VideoID</th>
				<th>Video Name</th>
				<th>Video Type</th>
				<th>User Name</th>
				<th bgcolor="#9cace2">Update Details</th>
				<th bgcolor="#aa6055">Delete Details</th>
			</tr>
			
			<c:forEach var="rql" items="${reqlidetails}">
			
				  <c:set var="Id" value="${rql.id}"/>
				  <c:set var="videoname" value="${rql.videoname}"/>
				  <c:set var="type" value="${rql.vtype}"/>
				  <c:set var="Uname" value="${rql.usname}"/>
				  
				 <c:url value="Updatedetails.jsp" var ="update">
				 	<c:param name="id" value="${Id}"/>
				 	<c:param name="videoname" value="${videoname}"/>
				 	<c:param name="type" value="${type}"/>
				 	<c:param name="username" value="${Uname}"/>
				 </c:url>
				
				<tr>
					<td>${rql.id}</td>
					<td>${rql.videoname}</td>
					<td>${rql.vtype}</td>
					<td>${rql.usname }</td>
					<td><a href="${update}"><button type ="submit" class="bt1">Update</button></a></td>
					  
					<td>
						<form action="deleteR" method="post">
						 	<input type = "hidden" name ="id" value="${rql.id}"/>
						 	<input type = "hidden" name ="uname" value="${rql.usname}"/>
						 	<input type = "submit" class="delete" name="submit" value="Delete">
						 </form>	
					 </td>
				 </tr>
			  
			 </c:forEach> 
			
			 </table>
			 
		</div>
		
		
		<div class="cont">
			<a href = "requestform.jsp">
				<button type ="submit" class="bt2">Continue request</button>
			</a>
		</div>
	
	
	<br><br><br>
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