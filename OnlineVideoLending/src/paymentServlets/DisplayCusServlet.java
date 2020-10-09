package paymentServlets;

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

@WebServlet("/DisplayCusServlet")
public class DisplayCusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		
		List<User> useDetails = SigninDButill.display(username); //assign the list object to validate
		 request.setAttribute("useDetails", useDetails); 
		
		RequestDispatcher dis =request.getRequestDispatcher("UserProfile.jsp");
		dis.forward(request, response);
		
	}

}
