package adminServlets;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import adminDBUtils.FileUploadDBUtil;



@WebServlet("/FileUploadServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
				 maxFileSize = 1024 * 1024 * 50 ,
				 maxRequestSize = 1024 *1024* 50)

public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//private static final String UPLOAD_DIR="videos";
	 
	    public FileUploadServlet() {
	        super();
	    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		int Id = Integer.parseInt(request.getParameter("Id"));
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		
		//video file filename extracting
		Part part = request.getPart("file");
		String fileName = extractFileName(part);
		String savePath = "C:\\Users\\Dewmini Kaveena\\Downloads\\OnlineVideoLending\\WebContent\\video\\" + File.separator + fileName ;
		File fileSaveDir = new File(savePath);
		
		if(!fileSaveDir.exists()) {
		fileSaveDir.mkdir();
	}
		
		//trailer file filename extracting
		Part part1 = request.getPart("tfile");
		String trailerfile = extractFileName(part1);
		String trailerPath = "C:\\Users\\Dewmini Kaveena\\Downloads\\OnlineVideoLending\\WebContent\\trailers\\" + File.separator + fileName ;
		File fileSaveDire = new File(trailerPath);
		
		if(!fileSaveDire.exists()) {
			fileSaveDire.mkdir();
		}
		
		FileUploadDBUtil.InsertVideoDetails(Id, name, type, savePath, fileName, trailerPath, trailerfile);
		
		
		
		 getServletContext().getRequestDispatcher("/response.jsp").forward(request, response);
		
	}

	//filename extracting method
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if(s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length() - 1);
			}
		}
		return "";
	}
	
	

}