package borrowVideoServlets;

//servlet for update details of playlist

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

@WebServlet("/UpdatePlaylistServlet")
public class UpdatePlaylistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//getting parameters from updatePlaylist.jsp
		String id = request.getParameter("id");
		String name=request.getParameter("name");
		String type = request.getParameter("type");
		String filename = request.getParameter("filename");
		String username =request.getParameter("username");
		
		boolean isTrue;
		
		isTrue = PlayListDBUtil.updatePlaylist(id, username, name, type, filename);//calling updatePlaylist() method
		
		//if update successful
		if(isTrue == true) {
			
			String userNm = request.getParameter("username");//getting parameter username
			
			List<PlayList> pDetails = PlayListDBUtil.display(userNm);//calling display() method of PlayDBUtil.java class and assign to pDetails object
			request.setAttribute("pDetails", pDetails);//setting pDetails object value to pDetails attribute
				
			RequestDispatcher dis = request.getRequestDispatcher("playlist.jsp");//response displaying page
			dis.forward(request, response);
			
		}
		
		//if update unsuccessful
		else {
			String userNm = request.getParameter("username");//getting parameter username 
			
			List<PlayList> pDetails = PlayListDBUtil.display(userNm);//calling display() method of PlayDBUtil.java class and assign to pDetails object
			request.setAttribute("pDetails", pDetails);//setting pDetails object value to pDetails attribute
				
			RequestDispatcher dis = request.getRequestDispatcher("playlist.jsp");//response displaying page
			dis.forward(request, response);
		}
		
	}

}
