package com.bookkart.database;

import java.sql.Connection;
import java.sql.Timestamp;

public class DAOClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DAOFactory daf = DAOFactory.getDAOConnectionFactory(1);
		
		MySQLContactDAO mdao = (MySQLContactDAO) daf.getContactDAO();
		
		Contact c = new Contact("pallavi", "pallavi0291@gmail.com", "good going", "bangalor", "wedding", new Timestamp(new java.util.Date().getTime()));
		
		int result = mdao.insertContactUs(c);
		if(result == 1){
			System.out.println("Insert done successfully");
		}
		
		
		

	}

}
