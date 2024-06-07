<%@page import="com.ccs.student_to_do_web_app.dto.Task"%>
<%@page import="com.ccs.student_to_do_web_app.service.ToDoWebAppService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateTask</title>
</head>
<body>
<%
	int tid=Integer.parseInt(request.getParameter("tid"));
	ToDoWebAppService service=new ToDoWebAppService();
	Task task= service.getTaskByIdService(tid);
%>

	<form action="UpdateTask" method="post" style='margin:150px 490px; '>
	<fieldset>
<table cellspacing='10px'>
		<legend>Add My Task</legend>
		<input value="<%=task.getTsid()%>" readonly="readonly" hidden="hidden" name="sid">
		<input value="<%=tid%>" readonly="readonly" hidden="hidden" name="tid">
		<tr><td><label for='sid'>Task Name: </label></td><td><input id='sid' value="<%=task.getTname() %>" type="text" placeholder='Task Name' name='tname' autofocus="autofocus"></td></tr>
		<tr><td><label for='sname'>Task Date: </label></td><td><input type="date" value="<%=task.getDate() %>" name='tdate' id='sname'></td></tr>
		
		<tr><td><label for='semail'>Task Information: </label></td><td><textarea name="tinfo" id='semail' rows="2" cols="22"><%= task.getTinfo() %> </textarea></td></tr>
		<tr><td><button type="submit" >Update Task</button></td></tr>
	</table></fieldset>
</form>
</body>
</html>