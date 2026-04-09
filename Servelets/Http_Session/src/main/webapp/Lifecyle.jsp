<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.lang.System" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!public void jspInit(){
 System.out.println("hi i am init method");}%>
 
<%!public void jspDestroy(){
 System.out.println("hi i am destroy method");}%>
 
 <%System.out.println("hi i am service Method");%>
 <h1> chello world </h1>
</body>
</html>