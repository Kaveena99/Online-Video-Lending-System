package adminServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminModels.Video;

import adminDBUtils.VideoDBUtil;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Video> vDetails = VideoDBUtil.display();
		
		request.setAttribute("vDetails", vDetails);
		
		RequestDispatcher dis = request.getRequestDispatcher("displayrecord.jsp");//go to displayrecord jsp page
		dis.forward(request, response); //method forward
	}

}
