package adminServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminDBUtils.AdminDBUtil;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String username = request.getParameter("uid"); //catch username
		 String password = request.getParameter("pass");//catch password
		 
		    try { //block of code to try
		    	
		    		if(AdminDBUtil.validate(username, password)){  //if username and password are valid
		    		
		    			RequestDispatcher dis=request.getRequestDispatcher("dashboard.jsp"); //redirect dashboard page
		    			dis.forward(request,response); //method forward
		    		} 
		    	
		    		else {  // if username and password are not valid
		    		
		    			System.out.println("Sorry username or password error");  //print message
		    			RequestDispatcher dis=request.getRequestDispatcher("adminlogin.jsp");
		    			dis.include(request,response); //method include
		    		}
		    		
			}catch (Exception e) { //block of code handle errors
				
					e.printStackTrace(); //print exception error msg
			} 
	}

}
