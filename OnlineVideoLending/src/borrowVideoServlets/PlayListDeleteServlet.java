package borrowVideoServlets;

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

@WebServlet("/PlayListDeleteServlet")
public class PlayListDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String username =request.getParameter("username");
		
		boolean isTrue;
		
		isTrue = PlayListDBUtil.DeleteVideo(id);//calling DeleteVideo() method
		
		//if delete successful
		if(isTrue == true) {
			
			List<PlayList> pDetails = PlayListDBUtil.display(username);//calling display() method of PlayDBUtil.java class and assign to pDetails object
			request.setAttribute("pDetails", pDetails);//setting pDetails object value to pDetails attribute
				
			RequestDispatcher dis = request.getRequestDispatcher("playlist.jsp");//response displaying page
			dis.forward(request, response);
			
		}
		
		//if delete unsuccessful
		else {
			String userNm = request.getParameter("username");//getting parameter username 
			
			List<PlayList> pDetails = PlayListDBUtil.display(userNm);//calling display() method of PlayDBUtil.java class and assign to pDetails object
			request.setAttribute("pDetails", pDetails);//setting pDetails object value to pDetails attribute
				
			RequestDispatcher dis = request.getRequestDispatcher("playlist.jsp");//response displaying page
			dis.forward(request, response);
		}
		
	}

}
