<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<link rel = "stylesheet" type = "text/css" href = "css2/userProfile.css" />   
	<meta charset="ISO-8859-1">
	<title>User Profile</title>
</head>

<body>

	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "menu4"  href="logout">Logout</a></li>
			<li class = "menu3"><a class = "menu4"  href="requestform.jsp">Request Videos</a></li>
			<li class = "menu3"><a class = "active1">User Profile</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>
	
	<h1 style="color:red ;text-align:center">User Profile</h1>
	
	<div class="card">
	
		<c:forEach var="use" items="${useDetails}">
	
				<c:set var="ID" value="${use.ID}"/>
				<c:set var="fname" value="${use.fname}"/>
				<c:set var="lname" value="${use.lname}"/>
				<c:set var="email" value="${use.email}"/>
				<c:set var="phone" value="${use.phone}"/>
				<c:set var="username" value="${use.uName}"/>
				<c:set var="password" value="${use.password}"/>
				
				
			  	<img src="images\profile.jpg" alt="user" style="width:100%">
			  	<h1>${use.fname} ${use.lname}</h1>
			  	<p class="title">${use.email}</p>
			  	<p>${use.uName}</p>
			  	<p><input type="hidden" name="id" value="${use.ID}"/></p>
			  		  
			  <form method="post" action="WatchNow.jsp">
			  	<input type="hidden" name="username" value="${use.uName}"/>
			  	<p><button>Watch now</button></p>
			  </form>
		 
		 </c:forEach> 
	  
	  	  <p><button  onclick="location.href='requestform.jsp'">Request video</button></p>
	
		 
		 <c:url value="payment.jsp" var="payment">
			 <c:param name="id" value="${ID}"/>
			 <c:param name="uname" value="${username}"/>
		 </c:url>
		   
		 <c:url value="EditCustomer.jsp" var="useupdate">
			  <c:param name="id" value="${ID}"/>
			  <c:param name="fname" value="${fname}"/>
			  <c:param name="lname" value="${lname}"/>
			  <c:param name="email" value="${email}"/>
			  <c:param name="phone" value="${phone}"/>
			  <c:param name="username" value="${username}"/>
		  	  <c:param name="pass" value="${password}"/>
		 </c:url>
		
		
		 <p>
		 	<a href="${payment}">
		  		<input type="button" name="update" value="Pay for Membership" >
		  	</a>
		 </p>
		  
		  
		  <p>
		  	<a href="${useupdate}">
		  		<input type="button" name="update" value="settings">
		  	</a>
		  </p>
		
		 <form action="delcus" method ="post">
			<input type="hidden" name="username" value="${username}"/>
			<input type="submit" name = "delete" value="RemoveAccount">
		</form>
		   
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