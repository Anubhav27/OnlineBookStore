package com.bookkart.action.feedback;

import java.sql.*;

import com.bookkart.database.DBDriverInfo;

public class RegisterContactDAO {
	
	public static int save(SubmitContact r){  
		
		int status=0;  
		
		
		
		try{  
			Class.forName(DBDriverInfo.MySQLDBJDBCDriver);  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/bookkartdb","root","anupallavi19");  
			
			
			  
			PreparedStatement ps=con.prepareStatement("insert into contactus(Contact_Name,Contact_Email,Contact_Message,Contact_City,Contact_Query_Type,Contact_TimeStamp) values(?,?,?,?,?,?)");  
			ps.setString(1,r.getName());  
			ps.setString(2,r.getEmail());  
			ps.setString(3,r.getMessage());  
			ps.setString(4,r.getCity());  
			ps.setString(5,r.getQuerytype());  
			java.sql.Timestamp timestamp = RegisterContactDAO.getCurrentTimeStamp();
			ps.setTimestamp(6, timestamp);
			          
			status=ps.executeUpdate();
			  
			}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
		
		return status;
		
	}
	
	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}
