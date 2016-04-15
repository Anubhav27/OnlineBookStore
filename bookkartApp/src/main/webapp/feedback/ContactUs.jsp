<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../html_head.jsp" %> 
<body>

	<%@ include file="../topnav.jsp" %> 
			
	<%@ include file="../headernav.jsp" %>
	
	<h1>Contact Us Form</h1>

	<s:form action="Welcome">
		<s:textfield name="contactname" label="Username" />
		<s:textfield name="contactemail" label="Email" />
		<s:textfield name="contactmessage" label="Message" />
		<s:textfield name="contactcity" label="City" />
		<s:textfield name="contactquery" label="Query" />
		
		<s:submit />
	</s:form>

</body>
</html>