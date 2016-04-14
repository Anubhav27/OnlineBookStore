package com.bookkart.database;

import java.sql.Connection;

public interface ContactDAO {
	
	public int insertContactUs(Connection conn , Contact con);
	public boolean deleteContactUS(Connection conn, Contact con);

}
