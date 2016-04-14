package com.bookkart.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySQLDAOFactory extends DAOFactory {
	
	private static String dbprotocol = "jdbc";
	private static String dbtype = "mysql";
	
	private String dbUrl;
	
	Connection conn = null;

	@Override
	public void loadJDBCDriver() {
		// TODO Auto-generated method stub
		
		try {
			Class.forName(DBDriverInfo.MySQLDBJDBCDriver);
			System.out.println("Mysql Database Driver Loaded Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to load MySQL JDBC Driver");
		}
		
	}

	@Override
	public Connection getDBConnection() {
		// TODO Auto-generated method stub
		
		Database mysqldb = new Database(DBInfo.MySqlUser,DBInfo.MySqlPassword,DBInfo.MySqlDBName,DBInfo.MySQLHost,DBInfo.MySqlPort,dbtype);
		dbUrl = dbprotocol + ":" + mysqldb.getDbType() + ":" + "//" + mysqldb.getDbHost() + ":" + mysqldb.getDbPort() + "/" + mysqldb.getDbName();
		
		try{
		conn = DriverManager.getConnection(dbUrl, mysqldb.getDbUser(), mysqldb.getDbPassword());
		System.out.println("Connection Established Successfully");
		}
		catch(SQLException e){
			System.out.println("Error establishing database connection");
			e.printStackTrace();
		}
		
		return conn;
		
	}

	@Override
	public void closeDBConnection() {
		// TODO Auto-generated method stub
		
		if(conn != null){
			try{
			conn.close();
			System.out.println("Connection closed successfully");
			}
			catch(SQLException e){
				System.out.println();
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public ContactDAO getContactDAO() {
		// TODO Auto-generated method stub
		return new MySQLContactDAO();
	}

}
