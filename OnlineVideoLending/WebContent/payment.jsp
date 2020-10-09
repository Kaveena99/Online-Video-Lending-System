<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
	<link rel = "stylesheet" type = "text/css" href = "css2/payment.css" />
	<meta charset="ISO-8859-1">
	<title>Payment Details</title>
</head>

<body style="background-color:#14141f;">

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
	String uname = request.getParameter("uname");
	%>
	
	<h1 style="color:red">Payment details</h1>
	
	<form action="cpayment" method="post">
	
		<input type="hidden" name="uname" value="<%=uname%>">
		
		ID
		<input type="text" name="id" value="<%=id %>"readonly>
		
		<p style="color:black">Please enter your card details.Your payment will be verify within 24 hours</p>
		<div class="row">
		  <div class="col-75">
		    <div class="container">
		    
		        <div class="row">
		          <div class="col-50">
		            <h3>Payment</h3>
		            
		            <label for="cname">Name on Card</label>
		            <input type="text"name="cardname" placeholder="Name on Card">
		            <label for="ccnum">Credit card number</label>
		            <input type="text" name="cardnumber" placeholder="Credit card number">
		            <label for="expmonth">Exp Month</label>
		            <input type="text" name="expmonth" placeholder="Exp Monthv">
		            
		            <div class="row">
		            
		              <div class="col-50">
		                <label for="expyear">Exp Year</label>
		                <input type="text"  name="expyear" placeholder="Exp Year">
		              </div>
		              
		              <div class="col-50">
		                <label for="cvv">CVV</label>
		                <input type="text" name="cvv" placeholder="xxx">
		               </div>
		               
		            </div>
		            
		          </div>
		        </div>
		        
		        <div class="col-25">
				    <div class="container">
					  <label for="cars">Select your membership:</label>
					  
					  <select id="total" name="total">
						  <option value="1299">Rs.1299 for 1 month</option>
						  <option value="2299">Rs.2299 for 2 month</option>
						  <option value="3299">Rs.3299 for 3 month</option>
					   </select>
				    </div>
		  		</div>
		        
		        <input type="submit" value="PAY" class="btn">
		     
		    </div>
		  </div>
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