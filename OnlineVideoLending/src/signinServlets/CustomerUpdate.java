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
 * Servlet implementation class CustomerUpdate
 */
@WebServlet("/CustomerUpdate")
public class CustomerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  /*  public CustomerUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String id = request.getParameter("id");
		int id= Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		
		boolean isTrue;
		isTrue= SigninDButill.updatecustomer(id,fname,lname,email,password);
		
		if(isTrue == true) {
			
			List <User> useDetails = SigninDButill.display(username); //assign the list object to validate
			 request.setAttribute("useDetails", useDetails); 
			
			RequestDispatcher dis =request.getRequestDispatcher("UserProfile.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis= request.getRequestDispatcher("error.jsp");
			dis.forward(request, response);
		}
		
		
		
	}
	
	

}
