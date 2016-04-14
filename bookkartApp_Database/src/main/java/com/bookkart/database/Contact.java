package com.bookkart.database;

import java.io.Serializable;
import java.sql.Timestamp;

public class Contact implements Serializable {
	
	//private int Contact_ID;
	private String Contact_Name;
	private String Contact_Email;
	private String Contact_Message;
	private String Contact_City;
	private String Contact_QueryType;
	private Timestamp Contact_TimeStamp;
	
	
	public Contact(String contact_Name, String contact_Email,
			String contact_Message, String contact_City,
			String contact_QueryType, Timestamp contact_TimeStamp) {
		super();
		//this.Contact_ID = contact_ID;
		this.Contact_Name = contact_Name;
		this.Contact_Email = contact_Email;
		this.Contact_Message = contact_Message;
		this.Contact_City = contact_City;
		this.Contact_QueryType = contact_QueryType;
		this.Contact_TimeStamp = contact_TimeStamp;
	}
	
	
	/*public int getContact_ID() {
		return Contact_ID;
	}
	public void setContact_ID(int contact_ID) {
		Contact_ID = contact_ID;
	}*/
	public String getContact_Name() {
		return Contact_Name;
	}
	public void setContact_Name(String contact_Name) {
		Contact_Name = contact_Name;
	}
	public String getContact_Email() {
		return Contact_Email;
	}
	public void setContact_Email(String contact_Email) {
		Contact_Email = contact_Email;
	}
	public String getContact_Message() {
		return Contact_Message;
	}
	public void setContact_Message(String contact_Message) {
		Contact_Message = contact_Message;
	}
	public String getContact_City() {
		return Contact_City;
	}
	public void setContact_City(String contact_City) {
		Contact_City = contact_City;
	}
	public String getContact_QueryType() {
		return Contact_QueryType;
	}
	public void setContact_QueryType(String contact_QueryType) {
		Contact_QueryType = contact_QueryType;
	}
	public Timestamp getContact_TimeStamp() {
		return Contact_TimeStamp;
	}
	public void setContact_TimeStamp(Timestamp contact_TimeStamp) {
		Contact_TimeStamp = contact_TimeStamp;
	}
	
	

}
