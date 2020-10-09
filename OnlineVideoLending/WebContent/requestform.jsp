<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Requests</title>
	<link rel="stylesheet" href="style/design.css" type="text/css">
</head>

<body class ="body">

	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "menu4"  href="logout">Logout</a></li>
			<li class = "menu3"><a class = "active1"  href="requestform.jsp">Request Videos</a></li>
			<li class = "menu3"><a class = "menu4" href="#">User Profile</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>

	<div class="formup">
	    <h1>Request Now!<span><I>Request and tell us what do you want!!</I></span></h1>
	    
	    <div class ="formstyle">
	    
		    <form  action="request"  method="post">
				<div class="input">
				<h2>User Name</h2><input type="text" name="uname"><br><br>
				
				<h2>Video Name</h2> <input type = "text"name="name" placeholder="Enter your choise">  <br><br>
				
				<h2>Video Type</h2>     <select id ="type" name="type">                                           
								<option value="Movies">Movies</option>
								<option value="Cartoons">Cartoons</option>
								<option value="Songs">Songs</option>
								<option value="TV Series">TV Series</option>
								<option value="Educational">Educational</option>
								<option value="Comedy">Comedy</option>
								
							</select><br><br>
				
							<button type="submit">Request</button>	
				</div>
			</form>
			
			<br><br><br><br>
			<a href = "Resuestlist.jsp">
			<input type ="submit" name = "submit" value ="View and Change Request">
			</a>
				
		</div>
	</div>


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