<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

	<!-- what ever we write inside this angle brackets will be treated as a java code  -->

	<!-- DIRECTIVE -->
	<!-- This tag  is  used to import any packages like we import in java servlet  -->
	<%@ page import="java.util.Date"%>



	<!-- DECLERATION -->
	<!--To declare variable or anything outside servlet service method -->
	<%!Date currentDate =new Date();%>


	<!-- SCRIPLET -->
	<!-- t what ever we write inside this will go to servlet service method  -->
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int result = num1 + num2;
	out.println("Current Date - "+currentDate);
	out.println("Output - " + result);
	%>


	<!-- EXPRESSION -->
	<!-- t what ever we write inside this will go to out.println() method  -->
	<%="Current Date - "+currentDate%>
	<%="Output - " + result%>


</body>
</html>