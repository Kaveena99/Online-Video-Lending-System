package borrowVideoServlets;

//servlet for insert values to playlist

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import borrowVideoDBUtils.PlayListDBUtil;


@WebServlet("/PlayListInsertServlet")
public class PlayListInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting parameters from displayResult.jsp page
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String filename = request.getParameter("filename");
		String username = request.getParameter("username");
		
		//calling method InserPlayList() and assign value to a variable
		boolean isTrue;
		isTrue = PlayListDBUtil.InsertPlayList(username,name, type,filename);
		
		//if inserting values successful redirecting to the WatchNow.jsp page 
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("WatchNow.jsp");
			dis.forward(request, response);
		}
		
		//if inserting values failed redirecting to the unsuccess.jsp page with an unsuccessful message
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
		
		

		
	}

}
