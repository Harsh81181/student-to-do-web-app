<%@page import="java.io.PrintWriter"%>
<%@page import="com.ccs.student_to_do_web_app.dto.Task"%>
<%@page import="java.util.List"%>
<%@page import="com.ccs.student_to_do_web_app.service.ToDoWebAppService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Task</title>
</head>
<body style="background-color: #495057;">
<%
ToDoWebAppService service= new ToDoWebAppService();
List<Task> l;
try{
	l= service.getAllTaskService((Integer.parseInt(request.getParameter("sid"))));
}catch(Exception e){
	l= service.getAllTaskService((Integer)(request.getAttribute("sid")));
}
%>
<center>
<table border="1px" style='color: white'>
	<tr>
		<th>TaskName</th>
		<th>TaskInfo</th>
		<th>TaskDate</th>
		<th colspan="2">Action</th>
	</tr><tr></tr>
	<%  for(Task t:l){ %>
	<tr>
		<td><%=t.getTname() %></td>
		<td><%=t.getTinfo() %></td>
		<td><%=t.getDate()%></td>
		<td><a href="DeleteTask?tid=<%= t.getTid() %>"><button style='background-color: red; color:white;'>Delete</button></a></td>
		<td><a href="UpdateTask.jsp?tid=<%= t.getTid() %>"><button style='background-color: green; color:white;'>Update</button></a></td>
	</tr>
	<tr></tr>
	<%} %>
</table></center>

</body>
</html>