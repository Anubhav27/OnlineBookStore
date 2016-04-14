package com.bookkart.database;

import java.sql.Connection;


public abstract class DAOFactory {
	
	public static final int MYSQL = 1;
	public static final int MONGODB = 2;
	
	public static DAOFactory getDAOConnectionFactory(int dbType){
		switch(dbType){
			case 1:
					return new MySQLDAOFactory();
			case 2:
					return new MongoDAOFactory();
			default:
					return null;
		}
	
		
	}
	
	public abstract void loadJDBCDriver();
	public abstract Connection getDBConnection();
	public abstract void closeDBConnection();
	public abstract ContactDAO getContactDAO();
	
	

}
