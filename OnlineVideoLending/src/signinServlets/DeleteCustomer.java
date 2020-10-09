package signinServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import signinDBUtils.SigninDButill;

/**
 * Servlet implementation class DeleteCustomer
 */
@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean isTrue;
		//int id= Integer.parseInt(request.getParameter("id"));
		String username = request.getParameter("username");
		isTrue = SigninDButill.DeleteCustomer(username);
		if(isTrue) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis =request.getRequestDispatcher("error.jsp");
			dis.forward(request, response);
		}
		

}
}