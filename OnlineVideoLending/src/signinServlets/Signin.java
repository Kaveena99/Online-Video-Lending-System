package signinServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signinDBUtils.SigninDButill;
import signinModels.User;


/**
 * Servlet implementation class Signin
 */
@WebServlet("/Signin")
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 k* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("uname");
		String password = request.getParameter("psw");
		
		
		boolean isTrue;
		
		List<User> udetails = SigninDButill.validate(username);
		
		if(udetails==null) {

		isTrue = SigninDButill.insertUser(fname, lname, email, phone,username, password);
		//data insert success check
		if(isTrue == true) {
			
			List <User> useDetails = SigninDButill.display(username); //assign the list object to validate
			 request.setAttribute("useDetails", useDetails); 
			
			RequestDispatcher dis =request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("error.jsp");//error popup
			dis.forward(request, response);
			
		}
		
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("already.jsp");//error popup
			dis.forward(request, response);
		}
		
	}

}
