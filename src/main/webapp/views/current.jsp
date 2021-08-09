<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!--  get data from model -->
<%
     
   Integer id = (Integer) request.getAttribute("id");
   String name = (String) request.getAttribute("name");
   
  



%>

<h2>     id is <%= id %>  </h2>
<h2>     name is <%= name %></h2>


</body>
</html>