<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Update Details</title>
	<link href = "css1/style2.css" rel = "stylesheet" type = "text/css"/>
</head>

<body style="background-color: #202020">

	<div class="header">
		<ul class="menu1">
			<li class="menu2">Admin</li>
		</ul>
	</div>
	
		<% 
			//catch the details
			String id = request.getParameter("id"); 
			String name = request.getParameter("name");
			String type = request.getParameter("type");
			String filename = request.getParameter("filename");
			String trailerfile = request.getParameter("trailerfile");
		%>
		
	<form action="updatevideo" method="post">
	
		<h2><font color = "red">Update Video Details</font></h2>
		
		<div class="div2">
			<br><br><br><br>
			<table>
		
				<tr>
					<td>Video ID : </td>
					<td><input type ="text" name="id" value="<%= id%>" readonly> <td>
				</tr>
				<tr>
					<td>Video Name : </td>
					<td><input type ="text" name="name" value="<%= name%>"> </td>
				</tr>
				<tr>
					<td>Video Type : </td>
					<td><input type ="text" name="type" value="<%= type%>"> </td>
				</tr>
				<tr>
					<td>Video : </td>
					<td><input type ="file" name="filename" value="<%= filename%>"> </td>
				</tr>
				<tr>
					<td>Trailer : </td>
					<td><input type ="file" name="trailerfile" value="<%= trailerfile%>"> </td>
				</tr>
				<tr>
					<td></td>
					<td><input type ="submit" name="submit" value ="Update video details"></td>
				</tr>
			</table>
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