<%@page import="java.util.ArrayList"%>
<%@page import="com.ccs.student_to_do_web_app.dto.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display by date</title>
</head>
<body  style="background-color: #495057;">
<%
	List<Task> list=(ArrayList)request.getAttribute("list");
%>
<%if(!list.isEmpty()){ %>
<center>
<table border="1px" style='color: white'>
	<tr>
		<th>TaskName</th>
		<th>TaskInfo</th>
		<th>TaskDate</th>
		<th colspan="2">Action</th>
	</tr><tr></tr>
	<%  for(Task t:list){ %>
	<tr>
		<td><%=t.getTname() %></td>
		<td><%=t.getTinfo() %></td>
		<td><%=t.getDate()%></td>
		<td><a href="DeleteDateTask?tid=<%= t.getTid() %>"><button style='background-color: red; color:white;'>Delete</button></a></td>
		<td><a href="UpdateTask.jsp?tid=<%= t.getTid() %>"><button style='background-color: green; color:white;'>Update</button></a></td>
	</tr>
	<tr></tr>
	<%}%>
</table>
<%}else{ %>
<center><h2 style='margin-top:200px; color: white'>&#129299; There is no task on this day. &#129299;</h2></center>
<%} %>
</center>
</body>
</html>