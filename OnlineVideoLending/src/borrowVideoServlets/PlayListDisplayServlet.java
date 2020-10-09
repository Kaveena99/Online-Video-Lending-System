package borrowVideoServlets;

//servlet for display customers playlist

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import borrowVideoDBUtils.PlayListDBUtil;
import borrowVideoModels.PlayList;

@WebServlet("/PlayListDisplayServlet")
public class PlayListDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");//getting parameter username from WatchNow.jsp page 
		
		List<PlayList> pDetails = PlayListDBUtil.display(username);//calling display() method of PlayDBUtil.java class and assign to pDetails object
		request.setAttribute("pDetails", pDetails);//setting pDetails object value to pDetails attribute
			
		RequestDispatcher dis = request.getRequestDispatcher("playlist.jsp");//response displaying page
		dis.forward(request, response);
		
	}

}
