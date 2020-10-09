<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

	<link rel = "stylesheet" type = "text/css" href = "css2/userProfile.css" />
	<meta charset="ISO-8859-1">
	<title>Success</title>

</head>

<body>
	
	<br><br><br><br><br><br><br>

	<h1 style="color:black ;text-align:center"> You'r payment will verify within 24 hours!!!!!!!!!</h1>
	
	<p style="color:black">please go to your </p>
	
	
	<% String uname = request.getParameter("uname");%>
	
	<form action="displayUser" method="post">
			<input type="hidden" name="uname" value="<%=uname%>">
			<button class="btn-success">Profile</button>
	</form>

</body>
</html>