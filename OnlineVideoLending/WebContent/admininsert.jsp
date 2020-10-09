<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Set" %>
<%@page import="java.util.HashSet" %>
<%@page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<title>Add Details</title>
	
	<link href = "css1/style2.css" rel = "stylesheet" type = "text/css"/>
</head>

<body style="background-color: #202020">

	<div class="header">
		<ul class="menu1">
			<li class="menu2">Admin</li>
		</ul>
	</div>
	
	<form action="FileUploadServlet" method="post" enctype="multipart/form-data">
	
	
		<h2><font color = "red">Enter Video Details</font></h2>
			<div class="div2">
				<br><br><br><br>
				<table>
				<tr>
					<td>Video Id : </td>
					<td><input type="number" name="Id" ></td>
				</tr>
				<tr>
					<td>Video Name : </td>
					<td><input type="text" name="name" ></td>
				</tr>
				<tr>
					<td>Video Type : </td>
					<td><input type="text" name="type" ></td>
				</tr>
				<tr>
					<td>Video Link : </td>
					<td><input type="file" name="file" ></td>
				</tr>
				<tr>
					<td>Trailer Link: </td>
					<td><input type="file" name="tfile" ></td>
				</tr>
				<tr>
					<td></td>
					<td ><input type="submit" value="Add Details" name="submit" ></td>
				</tr>
				</table>
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