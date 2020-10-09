package borrowVideoServlets;

//servlet for play the video of playlist

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import borrowVideoDBUtils.PlayDBUtil;
import borrowVideoModels.Play;


@WebServlet("/PlayServlet")
public class PlayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting parameter from playlist.jsp page
		String name = request.getParameter("name");
		
		//calling method validate() of PlayDBUtil.java class
		List<Play> plDetails = PlayDBUtil.validate(name);
		request.setAttribute("plDetails", plDetails);
		
		//send result to play.jsp page
		RequestDispatcher dis = request.getRequestDispatcher("play.jsp");
		dis.forward(request, response);
		
	}

}
