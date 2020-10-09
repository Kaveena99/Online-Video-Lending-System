package customerloginDBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import borrowVideoDBUtils.DBConnect;
import customerloginModels.Customer;

public class CustomerDBUtil {
	
	private static Connection con = null;//instance variables
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List <Customer> validate (String uName, String password){  //validate method
		
		//arrayList is use for return to customer details
		ArrayList <Customer> cus = new ArrayList <> (); //create object
		
		//validate 
		try { //block of code to try
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from regcus where uname = '"+uName+"' and password  = '"+password+"'";//sql query
			rs = stmt.executeQuery(sql);
		
			if (rs.next()) { //user name and password are valid
				int ID = rs.getInt(1); //get data
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String userU = rs.getString(6);
				String passU = rs.getString(7);
				
				//create object
				Customer c = new Customer(ID, fname, lname, email, phone, userU, passU);
			
				cus.add(c); //pass arraylist object
			}
		}
		
		catch (Exception e) { //block of code handle errors
			
			e.printStackTrace(); //print exception error message
		}	
		
		return cus; //return cus object
	}

}
