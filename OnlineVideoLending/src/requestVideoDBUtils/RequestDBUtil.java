package requestVideoDBUtils;


import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import borrowVideoDBUtils.DBConnect;
import requestVideoModels.requestlist;
import requestVideoModels.requestvideo;



public class RequestDBUtil {

	private static Connection c = null;
	private static Statement s = null;
	private static ResultSet rs = null;
	private static boolean Success;

	public static List<requestvideo>  validate (String Name){
		
				
		  ArrayList<requestvideo> reqv = new ArrayList<>(); 
		  		  
		 
		  	
			
		  //validate
		  
			  try {
			  
			  c = DBConnect.getConnection();
			  s = c.createStatement();
			  
			  
			  String sql = "select * from video where name='"+Name+"' ";
			  rs = s.executeQuery(sql);
			  
				 
			   if(rs.next()) {
				  int Id = rs.getInt(1);
				  String vname = rs.getString(2);
				  String type = rs.getString(3);
				  String video = rs.getString(4);
				  String filename = rs.getString(5);
				  String trailer = rs.getString(6);
   				  
   				  String trailerfile = rs.getString(7);
   				  
				  
				  
				  requestvideo rv = new requestvideo(Id,vname,type,video,filename,trailer,trailerfile); 
					 reqv.add(rv);
				
			   }else {
				   reqv = null;
			   }
				 
			  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
		  return reqv;
		  
		  }

		

	
	public static boolean insertrequest(String vidname,String vtype,String uname) {
		
			
			
			
		
			boolean Success = false;
			
			
			  
			  try {
				  
				 c = DBConnect.getConnection();
				 s=c.createStatement();
				  
				  String sql="insert into requestvideo values(0,'"+vidname+"','"+vtype+"','"+uname+"')";
				  int rv= s.executeUpdate(sql);
				  
				  if(rv > 0) {
					  
					  Success= true;
					  
				  }else {
					  Success = false;
					  
				  }
				  
			  		  
			  }
			catch(Exception e) {
				
				e.printStackTrace();
			}
			
			
			
			return Success;
		}
	

	public static List<requestlist> display(String username){
		ArrayList<requestlist> rl= new ArrayList<>();
		
		 
		//validate  
		try {
			
			 c = DBConnect.getConnection();
			 s = c.createStatement();
			 
	         String sql = "select * from requestvideo Where UserName = '"+username+"'";
		     rs = s.executeQuery(sql);
		
		//get values from colums
		while(rs.next()) {
			int Id = rs.getInt(1);
			String name= rs.getString(2);
			String type = rs.getString(3);
			String uname = rs.getString(4);
			
			requestlist rql = new requestlist(Id,name,type,uname);
			rl.add(rql);
		}
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return rl;
	}
	
	
	public static boolean updaterequestdetails(String ID,String videoname,String type,String uname) {
		
		 
		  
		  try {
			  
			  
			     c = DBConnect.getConnection();
				 s = c.createStatement();
			  
			  String sql = "update requestvideo set VideoName='"+videoname+"',VideoType='"+type+"',UserName='"+uname+"'"+"where RequestID='"+ID+"'";
			  int urv = s.executeUpdate(sql);
			  
			  if(urv>0) {
				  Success=true;
			  }else {
				  Success=false;
			  }
			  
			  
		  }
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return Success;
		
		
	}
	
	public static List<requestlist> getRequestCustomer(String Id){
		
		
		int convert = Integer.parseInt(Id);
		ArrayList<requestlist> reqcust = new ArrayList<>();
		 
	
		try {
			
			 c = DBConnect.getConnection();
			 s = c.createStatement();
			
			 String sql = "Select * from requestvideo where RequestID='"+convert+"'";
			 rs = s.executeQuery(sql);
			 
			 while(rs.next()) {
				 
				 int ID = rs.getInt(1);
				 String vname = rs.getString(2);
				 String type = rs.getString(3);
				 String Uname = rs.getString(4);
				 
				 requestlist rl = new requestlist(ID,vname,type,Uname);
				 reqcust.add(rl);
				 
			 }
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return reqcust;
	}

	
	

	public static boolean deleteRequestCustomer(String Id){
		
		
		boolean Success = false;
		 
		
		try {
			
			 c = DBConnect.getConnection();
			 s = c.createStatement();
			
			 String sql = "delete  from requestvideo where RequestID='"+Id+"'";
			 int rs=s.executeUpdate(sql);
			 
			if(rs>0) {
				Success = true;
			}
			else {
				Success = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return Success;
	
	}

}



	





