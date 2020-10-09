<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Update</title>
	<link rel="stylesheet" href="style/update.css" type="text/css">
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
	
	<%
		String Id = request.getParameter("id");
		String videoname = request.getParameter("videoname");
		String type = request.getParameter("type");
		String Uname = request.getParameter("username");
	%>
	
	<div class="onform">
	
		<form action="updateR"  method="post">
			<div class="inform">
				<h2><I>Video ID</I> </h2><input type = "text" name="id" value="<%= Id%>" readonly>
				
				<h2><I>User Name</I> </h2><input type ="text" name="uname" value="<%= Uname %>"><br> <br>
				
				<h2><I>Video Name</I></h2><input type = "text" name="name" value="<%= videoname %>">
				
				<h2><I>Video Type</I> </h2>
				  <select id ="type" name="type">
			                <option value="Movies">Movies</option>
							<option value="Cartoons">Cartoons</option>
							<option value="Songs">Songs</option>
							<option value="TV Series">TV Series</option>
							<option value="Educational">Educational</option>
							<option value="Comedy">Comedy</option>	
				 </select><br><br>
			
			   	<button type="submit">Change details</button>	
			</div>
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