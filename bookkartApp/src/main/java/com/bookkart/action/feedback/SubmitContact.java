package com.bookkart.action.feedback;

import java.sql.Connection;
import java.sql.Timestamp;

import com.bookkart.database.*;

public class SubmitContact {
	
	private String name;
	private String email;
	private String message;
	private String city;
	private String querytype;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getQuerytype() {
		return querytype;
	}



	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}



	public String execute(){
		
		String ret = "success";
		
		DAOFactory daf = DAOFactory.getDAOConnectionFactory(1);
		MySQLContactDAO mdao = (MySQLContactDAO) daf.getContactDAO();
		
		Contact c = new Contact(this.getName(),this.getEmail(),this.getMessage(),this.getCity(),this.getQuerytype(),new Timestamp(new java.util.Date().getTime()));
		System.out.println(this.getName());
		int result = mdao.insertContactUs(c);
		if(result > 0){
			ret = "success";
			
		}
		else{
			ret = "error";
		}
		
		return ret;
		/* int i=RegisterContactDAO.save(this);  
		    if(i>0){  
		    return "success";  
		    }  
		    return "error";  */
		
		
	}

}
