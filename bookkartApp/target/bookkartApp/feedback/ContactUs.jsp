<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../html_head.jsp" %> 
<body>

	<%@ include file="../topnav.jsp" %> 
			
	<%@ include file="../headernav.jsp" %>
	
	<h1 style="text-align:center">Contact Us</h1>

	<!--<s:form action="Welcome">
		<s:textfield name="contactname" label="Username" />
		<s:textfield name="contactemail" label="Email" />
		<s:textfield name="contactmessage" label="Message" />
		<s:textfield name="contactcity" label="City" />
		<s:textfield name="contactquery" label="Query" />
		
		<s:submit />
	</s:form>-->
	
	<!-- <div class="col-sm-5" style="text-align: center">
		<form class="form-horizontal" role="form" action="SubmitContact" method="get"> 
			
			 <div class="form-group">
			    <label class="control-label col-sm-2" for="name">Name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="name" placeholder="Enter Name">
			    </div>
	  		 </div>
			 <div class="form-group">
			    <label class="control-label col-sm-2" for="email">Email</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="email" placeholder="Enter email" aria-describedby="emailaddon">
			    </div>
	  		 </div>
			 <div class="form-group">
			    <label class="control-label col-sm-2" for="message">Message</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" rows="5" id="message" placeholder="Enter Message">
			    </div>
	  		 </div>
	  		 <div class="form-group">
			    <label class="control-label col-sm-2" for="city">City</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" rows="5" id="city" placeholder="Choose City">
			    </div>
	  		 </div>
	  		 <div class="form-group">
			    <label class="control-label col-sm-2" for="querytype">Query</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" rows="5" id="querytype" placeholder="Choose Query Type">
			    </div>
	  		 </div>
			  <div class="form-group"> 
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Submit</button>
			    </div>
			  </div>
		
		</form>
	</div>
     -->
     
     <s:form action="SubmitContact">  
		<s:textfield name="name" label="UserName"></s:textfield>  
		<s:textfield name="email" label="Email"></s:textfield>  
		<s:textfield name="message" label="Message"></s:textfield>  
		<s:textfield name="city" label="City"></s:textfield>  
		<s:textfield name="querytype" label="QueryType"></s:textfield>  
		
		  
		<s:submit value="Submit"></s:submit>  
  
</s:form>  
</body>
</html>