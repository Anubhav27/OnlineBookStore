package com.bookkart.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class MySQLContactDAO implements ContactDAO {
	
	public MySQLContactDAO(){
		
	}

	@Override
	public int insertContactUs(Contact con) {
		// TODO Auto-generated method stub
		MySQLDAOFactory myf = new MySQLDAOFactory();
		myf.loadJDBCDriver();
		Connection conn = myf.getDBConnection();
		int rs = 0;
		if(conn == null){
			System.out.println("connection is null");
		}
		else{
		System.out.println("connection is not null");
		
		String sql = "insert into contactus(Contact_Name,Contact_Email,Contact_Message,Contact_City,Contact_Query_Type,Contact_TimeStamp) values(?,?,?,?,?,?)";
		
		try {
			System.out.println(con.getContact_City());
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			System.out.println(con.getContact_City());
		   // ps.setInt(1, con.getContact_ID());
		    ps.setString(1, con.getContact_Name());
		    ps.setString(2, con.getContact_Email());
		    ps.setString(3, con.getContact_Message());
		    ps.setString(4, con.getContact_City());
		    ps.setString(5, con.getContact_QueryType());
		    ps.setTimestamp(6, con.getContact_TimeStamp());
		    System.out.println(con.getContact_City());
		    rs = ps.executeUpdate();
		    System.out.println(con.getContact_City());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL exception occured");
			e.printStackTrace();
		}
		
		myf.closeDBConnection();
		}
		return rs;
	}

	@Override
	public boolean deleteContactUS(Contact con) {
		// TODO Auto-generated method stub
		return false;
	}

}
