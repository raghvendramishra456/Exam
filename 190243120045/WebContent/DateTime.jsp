<%@ page import="java.util.Date" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
		h3{
			color:blue
		}

</style>
</head>
<body>
	
		<% Date d = new Date(); %>
		
		 <h1>Current Date And Time</h1>
		 
		 <h3>Date : <%=d %></h3>
</body>
</html>