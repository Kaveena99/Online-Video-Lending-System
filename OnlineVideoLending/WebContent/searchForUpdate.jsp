<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Search for Update</title>
	<link rel="stylesheet" type="text/css" href="css/style3.css">
</head>

<body>

		<%
			String id = request.getParameter("id");
			String username = request.getParameter("username");
		%>
		
	<div class="header">
		<ul class="menu1">
			<li class="menu2">WatchIt</li>
			<li class = "menu3"><a class = "menu4"  href="logout">Logout</a></li>
			<li class = "menu3"><a class = "menu4"  href="requestform.jsp">Request Videos</a></li>
			<li class = "menu3"><a class = "active1" href="#">User Profile</a></li>
			<li class = "menu3"><a class = "menu4"  href="HomePage.jsp">Home</a></li>
		</ul>
	</div>

	<h2>Find a video to replace !</h2>
	
	<div class="div1"> 	

		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="text" name="vname" placeholder="Search" class="i1">
			<input type="submit" name="submit" value="Search" class="search">
		</form><br><br><br>
		
		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="hidden" name="vname" value="Movies">
			<input type="submit" name="submit" value="Movies" class="btn"><br>
		</form>	
					
		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="hidden" name="vname" value="TV Series">
			<input type="submit" name="submit" value="TV Series" class="btn"><br>
		</form>
				
		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="hidden" name="vname" value="Cartoon">
			<input type="submit" name="submit" value="Cartoon" class="btn"><br>
		</form>
				
		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="hidden" name="vname" value="Comedy">
			<input type="submit" name="submit" value="Comedy" class="btn"><br>
		</form>
					
		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="hidden" name="vname" value="Songs">
			<input type="submit" name="submit" value="Songs" class="btn"><br>
		</form>
					
		<form action="searchUpdate" method="post">
			<input type="hidden" name="id" value="<%=id%>">
			<input type="hidden" name="username" value="<%=username%>">
			<input type="hidden" name="vname" value="Educational">
			<input type="submit" name="submit" value="Educational Videos" class="btn"><br>
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