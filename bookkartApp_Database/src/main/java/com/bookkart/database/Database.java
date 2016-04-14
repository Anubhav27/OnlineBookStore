package com.bookkart.database;

public class Database {
	
	private String dbUser;
	private String dbPassword;
	private String dbName;
	private String dbHost;
	private String dbPort;
	private String dbType;
	
	public Database(String dbUser,String dbPassword,String dbName,String dbHost,String dbPort,String dbType){
		this.dbUser = dbUser;
		this.dbHost = dbHost;
		this.dbPort = dbPort;
		this.dbPassword = dbPassword;
		this.dbName = dbName;
		this.setDbType(dbType);
	}
	
	public String getDbUser() {
		return dbUser;
	}
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
	
	public String getDbPassword() {
		return dbPassword;
	}
	
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
	
	public String getDbName() {
		return dbName;
	}
	
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
	public String getDbHost() {
		return dbHost;
	}
	
	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	
	public String getDbPort() {
		return dbPort;
	}
	
	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

}
