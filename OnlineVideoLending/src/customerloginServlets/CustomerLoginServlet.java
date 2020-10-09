package customerloginServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerloginDBUtils.CustomerDBUtil;
import customerloginModels.Customer;

@WebServlet("/CustomerLoginServlet")
public class CustomerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String uname = request.getParameter("uid"); //catch username
		 String password = request.getParameter("pass"); //catch password
		 
		 try{//block of code to try
			 
		 List <Customer>useDetails = CustomerDBUtil.validate(uname, password); //assign the list object to validate
		 request.setAttribute("useDetails", useDetails); //set the details and details send to user interface
		 
		 }catch (Exception e) { //block of code handle errors
			 
			 e.printStackTrace();//print exception error msg
		 }
		 
		 //go to another jsp page
		 RequestDispatcher dis = request.getRequestDispatcher("UserProfile.jsp");
		 dis.forward(request, response); //method forward
		 
		 
	}

}
