package com.bookkart.database;

import java.sql.Connection;

public interface ContactDAO {
	
	public int insertContactUs(Contact con);
	public boolean deleteContactUS(Contact con);

}
