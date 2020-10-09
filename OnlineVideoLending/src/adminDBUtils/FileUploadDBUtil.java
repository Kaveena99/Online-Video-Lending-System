package adminDBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FileUploadDBUtil {
	
	public static void InsertVideoDetails(int id,String name,String type,String path,String filename,String tpath,String tfile) {
		
		//validate
		
		try { //block of code to try
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinevideolending","root","ddkgj1234#");
			PreparedStatement pst = con.prepareStatement("insert into video (Id,name,type,video,filename,trailer,trailerfile) values (?,?,?,?,?,?,?)");//sql query
			
			pst.setInt(1, id); //setting value of 1st column 
			pst.setString(2, name); //setting value of 2nd column 
			pst.setString(3, type); //setting value of 3rd column 
			pst.setString(4, path); //setting value of 4th column 
			pst.setString(5, filename); //setting value of 5th column 
			pst.setString(6, tpath); //setting value of 6th column 
			pst.setString(7, tfile); //setting value of 7th column 
			
			pst.executeUpdate(); 
			
		}catch(Exception e) { //block of code handle errors
			
			e.printStackTrace(); //print exception error message
		}
	}
	
	

}
