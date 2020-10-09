package adminDBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import adminModels.Video;
import borrowVideoDBUtils.DBConnect;


public class VideoDBUtil {
	
	private static boolean isSuccess; //instance variables
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List <Video> validate (String name, String type, String filename, String trailerfile){  //validate method
		
		//arrayList is use for return to Video details
		ArrayList <Video> vid = new ArrayList <> (); //create object
		
		//validate
		try { //block of code to try
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from video where name = '"+name+"' and type  = '"+type+"' and filename = '"+filename+"' and trailerfile = '"+trailerfile+"'";//sql query
			rs = stmt.executeQuery(sql);
		
			while (rs.next()) { //if valid
				
				int id = rs.getInt(1); //get data
				String Name = rs.getString(2);
				String Type = rs.getString(3);
				String Video = rs.getString(4);
				String Filename = rs.getString(5);
				String Trailer = rs.getString(6);
				String Trailerfile = rs.getString(7);
				
				//create object
				Video v = new Video(id, Name, Type, Video, Filename, Trailer, Trailerfile);
			
				vid.add(v); //pass arraylist object
			}
			
		}catch (Exception e) { //block of code handle errors
			
			e.printStackTrace(); //print exception error message
		}	
		
		return vid; //return cus object
	}
	
	public static List <Video> display (){
		
		 String url = "jdbc:mysql://localhost:3306/onlinevideolending"; //database connect url
		 String user = "root"; // database username
		 String pass = "ddkgj1234#"; // database password
	
		
	    //arrayList is use for return to video details
		ArrayList <Video> vid = new ArrayList <> (); //create object
		
		//validate part
		try { //block of code to try
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from video"; //sql query
			ResultSet res = stmt.executeQuery(sql);
			
					
			while (res.next()) {
				
				//get data
				int Id = res.getInt(1);
				String name = res.getString(2);
				String type = res.getString(3);
				String video = res.getString(4);
				String filename = res.getString(5);
				String trailer = res.getString(6);
				String trailerfile = res.getString(7);
				
				//create object
				Video v = new Video(Id, name, type, video, filename, trailer, trailerfile);
			
				vid.add(v); //pass arraylist object
			}
			
			}catch (Exception e) {//block of code handle errors
				
				e.printStackTrace(); //print exception error message
			}
			
			return vid;  //return ad object
	}
	
	public static boolean updateVideo(String id,String name,String type,String filename, String trailerfile) {
		
		try { //block of code to try
			
			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update video set name='"+name+"',type='"+type+"',filename='"+filename+"', trailerfile='"+trailerfile+"'"+"where Id='"+id+"'";//update query
			
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0) { //update part is success
				isSuccess = true;
			}
			
			else { //update part is unsuccess
				isSuccess = false;
			}
			
		}catch(Exception e){ //block of code handle errors
			
			e.printStackTrace(); //print exception error message
			
		}
		
		return isSuccess;//return isSuccess
	}
	
	public static boolean deleteVideo(String Id) {
		
		boolean isSuccess = false;
		
		try { //block of code to try
					
					con= DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "delete from video where Id = '"+Id+"'";//delete query
					
					int rs = stmt.executeUpdate(sql);
				
					if (rs > 0) {
						isSuccess = true;
					}
					
					else {
						isSuccess = false;
					}
					
				}catch(Exception e){ //block of code handle errors
					
					e.printStackTrace(); //print exception error message
					
				}
				
		return isSuccess;//return boolean value
	}
	
		
}
