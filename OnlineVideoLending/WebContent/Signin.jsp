<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<link rel = "stylesheet" type = "text/css" href = "css2/signin.css" />
	<meta charset="ISO-8859-1">
	<title>Sign in</title>
</head>

<body>

	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "active1"  href="Signin .jsp">Sign Up</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>
	
	<form action="signin" method="post">
		<div class="container">
			    <h1 style="color:white">Register</h1>
			    
			    <p style="color:white">Please fill in this form to create an account.</p>
			    <hr>
			
			    <label for="fname" style="color:white"><b>first name</b></label>
			    <input type="text" name="fname" required>
			
			    <label for="lname" style="color:white"><b>last name</b></label>
			    <input type="text" name="lname" >
			
			    <label for="emailt" style="color:white"><b>email</b></label>
			    <input type="text" name="email">
			    
			     <label for="phone" style="color:white"><b>Phone number</b></label>
			   	 <input type="text" name="phone" required><br>
			    
			     <label for="Uname" style="color:white"><b>User name </b></label>
			     <input type ="text" name="uname" required>
			    
			    <label for=" password " style="color:white"><b> password  </b></label>
			    <input type ="text" name="psw" required>
			    <hr>
			    
			    <button type="submit" class="registerbtn" name="signin" value="signin">Sign In</button>
		  </div>
		  
		  <div class="container signin">
		    <p style="color:white">Already have an account? <a href="login.jsp">Login</a>.</p>
		  </div>
	</form>
	
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