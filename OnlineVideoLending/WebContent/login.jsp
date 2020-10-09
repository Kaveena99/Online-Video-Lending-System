<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<title>Customer login page</title>
	<link href = "css1/style1.css" rel = "stylesheet" type = "text/css"/>

</head>

<body>

	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "menu4"  href="adminlogin.jsp">Admin Login</a></li>
			<li class = "menu3"><a class = "active1"  href="login.jsp">Login</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>
	
		<br><br>
	
	    <div class="loginbox">
	    <img src="images/avatar.png" class="avatar">
	   
	        <h1>Login Here</h1>
	        <form action = "logC" method = "post">
	        
	            <p>Username</p>
	            	<input type="text" placeholder="Enter Username" name = "uid" required>
	            	
	            <p>Password</p>
	            	<input type="password" placeholder="Enter Password" name = "pass" required>
	            	
	            	<input type="submit" name="submit" value="Login">
	           
				<br>
				<a href="Signin.jsp">Reset your password in here</a><br>
				<a href="Signin.jsp"> Sign up in here </a>
	            
	        </form>
		</div>
		
		<br><br><br>
		
		<footer>
		<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
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