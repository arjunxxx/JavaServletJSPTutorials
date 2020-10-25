<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
    <!-- This is jstl tag libraries to do tasks easier  -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>

<body>

${welcomeTag} <br/>


YOUR Favorite cars are <br/>


<c:forEach items="${carList}" var="car">

${car}  <br/>

</c:forEach>







<form action="index.jsp">
<input type="submit" value="go to main page">

</form>

</body>
</html>