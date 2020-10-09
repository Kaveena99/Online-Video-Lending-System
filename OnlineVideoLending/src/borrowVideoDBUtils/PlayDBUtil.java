package borrowVideoDBUtils;

//java class for create connection with the database and get values from the table playlist to Play selected video

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import borrowVideoModels.Play;

public class PlayDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//creating method to return list of details
	public static List<Play> validate(String Name){
		
		ArrayList<Play> pl = new ArrayList<>();//creating an object 
		
		//validate 
		
		try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from playlist where name = '"+Name+"'";//sql query
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					int Id = rs.getInt(1);//getting value of 1st column 
					String name = rs.getString(3);//getting value of 3rd column
					String type = rs.getString(4);//getting value of 4th column
					String filename = rs.getString(5);//getting value of 5th column
					
					Play p = new Play(Id,name,type,filename);
					
					pl.add(p);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return pl;//returning object(list of details)
	}
	
	


}
