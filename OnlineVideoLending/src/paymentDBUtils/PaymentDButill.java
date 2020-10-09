package paymentDBUtils;

import java.sql.Connection;
import java.sql.Statement;

import borrowVideoDBUtils.DBConnect;




public class PaymentDButill {
	
	private static Connection con = null;
	private static Statement stmt = null;
	
public static boolean paymentdetails(int id, String cardname,String cardnumber,String expmonth,String expyear,String cvv,String total)	{
	boolean isSuccess = false;
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "insert into payment values(0,'"+cardname+"','"+cardnumber+"','"+expmonth+"','"+expyear+"','"+cvv+"','"+total+"' )";
		int rs=stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
	
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	


return isSuccess;
}

}
