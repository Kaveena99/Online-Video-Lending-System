package adminDBUtils;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import borrowVideoDBUtils.DBConnect;
public class AdminDBUtil {
	
	private static Connection con = null; //instance variables
	private static Statement stmt = null;
	//private static ResultSet rs = null;
	
	public static boolean validate(String username, String password) { //admin details validate method
		
		
		boolean status=false;
		
    	//validate part
		try{  //block of code to try
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			PreparedStatement ps = con.prepareStatement("select * from admin where username=? and password=?"); //sql query
			
			ps.setString(1,username); //set username
			ps.setString(2,password); //set password
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		}catch(Exception e){ //block of code handle errors
			
			System.out.println(e);
		}
		
		return status; //return status
		
		}

//create connection with database and insert details
public static boolean insertadmin(String name, String type, String video, String filename, String trailer, String trailerfile) {
	
		boolean isSuccess = false; 
		
		
		try { //block of code to try
		
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
		    String sql = "insert into video values (0,'"+name+"','"+type+"','"+video+"','"+filename+"', '"+trailer+"','"+trailerfile+"')";//sql query
			int rs = stmt.executeUpdate(sql);//run sql query
			
			if(rs > 0) {
				
				isSuccess = true; //successfull added
			}
			
			else{
				
				isSuccess = false; //unsuccessfull
			}
			
		}catch (Exception e) {//block of code handle error
			
			e.printStackTrace();//print exception error message
		}
		
		return isSuccess;
	}

}

