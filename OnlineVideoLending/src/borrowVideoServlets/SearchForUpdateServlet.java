package borrowVideoServlets;

//servlet for search the name that customer enters for update a video

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import borrowVideoDBUtils.SearchDBUtil;
import borrowVideoModels.Video;


@WebServlet("/SearchForUpdateServlet")
public class SearchForUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting parameter from searchForUpdate.jsp page
				String videoname = request.getParameter("vname");
				
				try {
					
				//calling method validate of SearchDBUtil.java class
				List<Video> vDetails = SearchDBUtil.validate(videoname);
				request.setAttribute("vDetails", vDetails);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
				//send result to updatePlaylist.jsp page
				RequestDispatcher dis = request.getRequestDispatcher("updatePlaylist.jsp");
				dis.forward(request, response);
		
	}

}
