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


@WebServlet("/UpdateVideoServlet")
public class UpdateVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//save the details
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String filename=request.getParameter("filename");
		String trailerfile=request.getParameter("trailerfile");
		
	
		boolean isTrue; //catch the boolean variable
		
		isTrue = VideoDBUtil.updateVideo(id, name, type, filename, trailerfile);//calling updateVideo() method
		 
		if (isTrue == true) { //if update is success
			
			 List <Video>vDetails = VideoDBUtil.display(); //assign the list object to validate
			 request.setAttribute("vDetails", vDetails); //set the details and details send to user interface
			 
			RequestDispatcher dis = request.getRequestDispatcher("displayrecord.jsp"); //go to the displayrecord jsp page 
			 dis.forward(request, response);//method forward
		}
		
		else{ //if update is unsuccess
			 
			RequestDispatcher dis = request.getRequestDispatcher("updatevideo.jsp"); // go to the updatevideo jsp page
			 dis.forward(request, response);//method forward
		}
	
	}		
		
}

