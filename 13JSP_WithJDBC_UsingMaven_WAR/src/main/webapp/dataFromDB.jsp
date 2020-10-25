<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		String url = "jdbc:mysql://localhost:3306/myschema";
	String userName = "root";
	String password = "root";
	String sql = "select * from student";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, userName, password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);

	while (rs.next()) {
	out.println(rs.getString(1) + "   " + rs.getString(2) + "   " + rs.getString(3) + "   " + rs.getString(4)+"</br>");
	
	}
	%>


</body>
</html>