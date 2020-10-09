package signinDBUtils;
//import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import borrowVideoDBUtils.DBConnect;
import signinModels.User;




public class SigninDButill {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	//modify
	
	
	//signin
	public static boolean insertUser(String fname,String lname,String email,String phone,String uname,String password) {
		
		boolean isSuccess = false; ///////
		
		//validate
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			//querry
		String sql = "insert into regcus values (0,'"+fname+"','"+lname+"', '"+email+"','"+phone+"','"+uname+"','"+password+"')";		
		
		int reg = stmt.executeUpdate(sql);
		
		if(reg > 0) 
		{
			isSuccess = true;
		}else 
		{
		isSuccess = false;
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
			}
		
		
		
		return isSuccess; 
		
	}
	
	
	
	
	
	
	//creating method to display list of detail of customer
		public static List<User> display(String username){
			
			ArrayList<User> user = new ArrayList<>();
			
			try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "select * from regcus where uname = '"+username+"'";
					rs = stmt.executeQuery(sql);
				
					//getting values from columns 
					if (rs.next()) {
						int ID = rs.getInt(1);
						String fname = rs.getString(2);
						String lname = rs.getString(3);
						String email = rs.getString(4);
						String phone = rs.getString(5);
						String userU = rs.getString(6);
						String passU = rs.getString(7);
					
						User u = new User(ID, fname, lname, email, phone, userU, passU);
					
						user.add(u);
					}
				
				}catch(Exception e) {
					e.printStackTrace();
				}
			
			return user;//returning list
		
		}
	
		
		
		//method to validating username and passwrd
		public static List<User>  validate (String username){
			
			
			  ArrayList<User> user = new ArrayList<>(); 
			  		  
			  //validate
			  
				  try {
				  
				  con = DBConnect.getConnection();
				  stmt = con.createStatement();
				  
				  
				  String sql = "select * from regcus where uname='"+username+"'";
				  rs = stmt.executeQuery(sql);
				  
					 
				   if(rs.next()) {
					   int ID = rs.getInt(1);
						String fname = rs.getString(2);
						String lname = rs.getString(3);
						String email = rs.getString(4);
						String phone = rs.getString(5);
						String userU = rs.getString(6);
						String passU = rs.getString(7);
	   				  
					  
					  
					  User u = new User(ID,fname,lname,email,phone,userU,passU); 
						 user.add(u);
					
				   }else {
					   user = null;
				   }
					 
				  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			  
			  return user;
			  
			  }
		
		
		
	
	
//for update
	public static boolean updatecustomer(int id,String fname,String lname,String email,String password) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update regcus set fname='"+fname+"',lname='"+lname+"',email='"+email+"',password='"+password+"'"+"where ID='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs >0) {
				isSuccess=true;
			}else {
				isSuccess= false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//delete
	public static boolean DeleteCustomer(String username) {
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String dsql="delete from regcus where uname='"+username+"'";
			
			int del = stmt.executeUpdate(dsql);
			if(del > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		
			}catch(Exception c) {
				c.printStackTrace();
			}
		return isSuccess;
	

	}
	
	
}
