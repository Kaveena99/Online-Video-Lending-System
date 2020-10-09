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
import requestVideoModels.requestlist;
import requestVideoModels.requestvideo;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String ID = request.getParameter("id");
		String videoname = request.getParameter("name");
		String type= request.getParameter("type");
		String username = request.getParameter("uname");
		
		List<requestvideo> requestdetails = RequestDBUtil.validate(videoname);
		if(requestdetails == null) {
			
		
		
		boolean T;
		
		
		T= RequestDBUtil.updaterequestdetails(ID, videoname, type,username);
		
	if(T == true) {
		
		List<requestlist> reqlidetails = RequestDBUtil.getRequestCustomer(ID);
		request.setAttribute("reqlidetails", reqlidetails);
		
		RequestDispatcher rd = request.getRequestDispatcher("requestresult.jsp");
		rd.forward(request, response);
		
	}
	else {
		
		List<requestlist> reqlidetails = RequestDBUtil.getRequestCustomer(ID);
		request.setAttribute("reqlidetails", reqlidetails);
		
		RequestDispatcher rd = request.getRequestDispatcher("requestresult.jsp");
		rd.forward(request, response);
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
