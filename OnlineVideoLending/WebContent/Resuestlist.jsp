<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Enter username for update</title>
	<link rel="stylesheet" href="style/first.css" type="text/css">
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
	
	<div class= "all">
		<div class="form">
			<form  action="result"  method="post">
			    <img src ="images/user.png"><br>
			    <div class="input">
				    <h2>UserName</h2>
				    <input type ="text" name="uname" placeholder="Enter username">
					<button type="submit">View Requests</button>	
				</div>
			</form>
		</div>
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