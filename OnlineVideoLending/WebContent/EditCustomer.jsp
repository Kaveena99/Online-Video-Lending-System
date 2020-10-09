<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<link rel = "stylesheet" type = "text/css" href = "css2/EditCustomer.css" />
	<meta charset="ISO-8859-1">
	<title>Update details</title>
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
	
	<%
	String id= request.getParameter("id");
	String fname= request.getParameter("fname");
	String lname= request.getParameter("lname");
	String email= request.getParameter("email");
	String username= request.getParameter("username");
	String password= request.getParameter("pass");
	%>
	
	<form action="updatecus" method="post">	
		<h1>Update details</h1>	
			
			<div class="card">
			
				  <img src="images\profile.jpg" alt="user" style="width:100%">
				  ID<input type="text" name="id" value="<%=id %>"readonly><br>
				  first name<input type="text" name="fname" value="<%=fname %>"><br>
				  last name<input type="text" name="lname" value="<%=lname %>"><br>
				  email<input type="text" name="email" value="<%=email %>"><br>
				  password<input type="text" name="password" value="<%=password %>"><br>
				 <input type="hidden" name="uname" value="<%=username%>">
				   
				 <p><button name="update" > update</button></p>
				 
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