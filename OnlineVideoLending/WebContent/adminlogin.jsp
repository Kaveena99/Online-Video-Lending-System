<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Admin Login</title>
	<link href = "css1/style2.css" rel = "stylesheet" type = "text/css"/>
</head>
<body style="background-color: #202020">

	<div class="header">
		<ul class="menu1">
			<li class="menu2">Admin</li>
		</ul>
	</div>
	
	<form action = "log" method = "post">


	<h2><font color = "red">Admin Login </font></h2>
	<br>

		<div class = "div4">
			
			<br>
			Username
			<br><br>
			<input type= "text" placeholder="Enter your username" name = "uid" required> 
				
			<br><br><br>
				
			Password
			<br><br>
			<input type= "password" placeholder="Enter your password" name = "pass" required> 
			
			<br><br><br>
			
			<input type= "submit" value="Login" name = "submit">
			<br><br>
						
		</div>
		
	</form>

		
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