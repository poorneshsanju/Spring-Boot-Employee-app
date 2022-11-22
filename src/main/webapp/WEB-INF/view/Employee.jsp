<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Read the textbox value</h1>
   <hr/>
   <form action="processForm" target="dashboard.jsp">
      <input type="number" name="empid" placeholder="Enter empid" />
      <input type="text" name="empname" placeholder="Enter employee name" />
      <input type="text" name="city" placeholder="Enter employee city" />
      <input type="number" name="mobile" placeholder="Enter employee mobile" />
      <input type="text" name="gender" placeholder="Enter employee gender" />
      <button type="submit">Send</button>
   </form>
</body>
</html>