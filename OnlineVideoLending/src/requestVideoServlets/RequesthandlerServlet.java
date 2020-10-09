package requestVideoServlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import requestVideoDBUtils.RequestDBUtil;
import requestVideoModels.requestvideo;



/**
 * Servlet implementation class RequesthandlerServlet
 */
@WebServlet("/RequesthandlerServlet")
public class RequesthandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String viname = request.getParameter("name");
		String type = request.getParameter("type");
		String uName = request.getParameter("uname");
			List<requestvideo> requestdetails = RequestDBUtil.validate(viname);
			
			if(requestdetails == null) {
				
				
				
				boolean True;
				
				True= RequestDBUtil.insertrequest(viname, type, uName);
				
				if(True == true) {
				
					 RequestDispatcher rd2 = request.getRequestDispatcher("success.jsp");
					 rd2.forward(request, response);
					 
				}
				
			}
             	else {
			
		                  try {
				
		                     request.setAttribute("requestdetails",requestdetails);
				
		                       }
		                catch(Exception e) {
			             e.printStackTrace();
		                           }

		                   RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		                  rd.forward(request, response);
		             }
	   	
		          }
			
}
	
	
	
	

	
	
	

     
