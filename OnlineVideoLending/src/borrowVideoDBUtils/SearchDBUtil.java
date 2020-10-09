package borrowVideoDBUtils;

//java class for connect with  the database and results for searched name

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import borrowVideoModels.Video;


public class SearchDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//method for get list of details
	public static List<Video> validate(String videoName){
	
		ArrayList<Video> v = new ArrayList<>();
	
		//validate 
		try {
			
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from video where name like '%"+videoName+"%' or type like '%"+videoName+"%'";//sql query
				rs = stmt.executeQuery(sql);
				
				//get values of columns 
				while(rs.next()) {
					int Id = rs.getInt(1);
					String name = rs.getString(2);
					String type = rs.getString(3);
					String video = rs.getString(4);
					String filename = rs.getString(5);
					String trailerfile = rs.getString(7);
					
					Video vi = new Video(Id,name,type,video,filename,trailerfile);//creating object and assign values
					
					v.add(vi);
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return v;//returning list of details
	}

}
