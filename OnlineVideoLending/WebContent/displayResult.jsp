<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Display Result</title>
	<link rel="stylesheet" type="text/css" href="css/style1.css">
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

	<h1>Results for searching</h1>

	
		<table class="table1">
		
			<tr><th>Trailer</th></tr> 
		
			<c:forEach var="v" items="${vDetails}">
				
				<%String username = request.getParameter("username"); %>	
				
				<tr>
					<td>
						<embed src="trailers/${v.trailerfile}" showcontrols="true" autostart="false" autoplay="false" ></embed><br>
					</td>
					<td>
						<form action="playListInsert" method="post">
						
							<input type="hidden" name="id" value="${v.id}"/>
							<input type="hidden" name="name" value="${v.name}"/>
							<input type="hidden" name="type" value="${v.type}"/>
							<input type="hidden" name="filename" value="${v.filename}"/>
							<input type="hidden" name="username" value="<%=username%>"/>
						
							<ul>
								<li>${v.name}<li>
								<li>${v.type}</li>
								<li><button value="<%=username%>" name="username" class="btn">Add to playlist</button></li>
							</ul>
							
						</form>	
					</td>
				</tr>
				
			</c:forEach>
		</table>
		
	<br><br><br><br>
	
	

</body>
</html>