package borrowVideoDBUtils;

//java class for create connection with the database and insert values into playlist table in the database and select values to display playlist

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import borrowVideoModels.PlayList;

public class PlayListDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//creating method to insert values to the playlist table and return true or false
	public static boolean InsertPlayList (String username,String name,String type,String filename) {
		
		boolean isSuccess = false;
		
		//inserting
		try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "insert into playlist (Id,customerUN,name,type,filename) values(0,'"+username+"','"+name+"','"+type+"','"+filename+"')";
				int rs = stmt.executeUpdate(sql);
				
				//if values inserted successfully isSuccess = true
				if(rs>0) {
					isSuccess = true;
				}
				
				//if inserting values failed isSuccess = false 
				else {
					isSuccess = false;
				}
			
			}catch(Exception e) {
				e.printStackTrace();//print error if there is any exception error
			}
		
		return isSuccess;//returning boolean value
		
	}
	
	
	
	//creating method to get list of detail of playlist of a customer
	public static List<PlayList> display(String username){
		
		ArrayList<PlayList> pla = new ArrayList<>();
		
		//validate 
		try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from playlist where customerUN = '"+username+"'";//selecting values from playlist table that matches to given username
				rs = stmt.executeQuery(sql);
			
				//getting values from columns 
				while(rs.next()) {
					int Id = rs.getInt(1);
					String name = rs.getString(3);
					String type = rs.getString(4);
					String filename = rs.getString(5);
				
					PlayList p = new PlayList(Id,name,type,filename);
				
					pla.add(p);
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return pla;//returning list
	
	}
	
	//creating method for update playlist
	public static boolean updatePlaylist(String id,String username,String name,String type,String filename) {
		
		boolean isSuccess = false;
		
		//update
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update playlist set name='"+name+"',type='"+type+"',filename='"+filename+"' where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;//returning boolean value
	}
	
	
	public static boolean DeleteVideo(String id) {
		
		boolean isSuccess = false;
		
		//delete
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();;
			String sql = "delete from playlist where id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;//returning boolean value
		
	}

}
