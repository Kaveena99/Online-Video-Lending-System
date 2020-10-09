package borrowVideoServlets;

//servlet for search enterer name and display results

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


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting parameter from WatchNow.jsp page
		String videoname = request.getParameter("vname");
		
		try {
			
		//calling method validate of SearchDBUtil.java class
		List<Video> vDetails = SearchDBUtil.validate(videoname);
		request.setAttribute("vDetails", vDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//send result to displayResult.jsp page
		RequestDispatcher dis = request.getRequestDispatcher("displayResult.jsp");
		dis.forward(request, response);
	}

}
