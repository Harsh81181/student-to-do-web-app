<%@page import="com.ccs.student_to_do_web_app.dto.Task"%>
<%@page import="com.ccs.student_to_do_web_app.service.ToDoWebAppService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskPage</title>
</head>
<body style="background-image: url('https://images.pexels.com/photos/1653631/pexels-photo-1653631.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'); background-size: cover;">

<%
	int tid=Integer.parseInt(request.getParameter("sid"));
%>

	<form action="AddTask" method="post" style='margin:150px 490px; width: 380px'>
	<fieldset style="border: 1px solid transparent; border-radius: 30px;  backdrop-filter: blur(5px);">
<table cellspacing='10px'>
		<legend style="margin-left: 100px; color: white">Add My Task</legend>
		<input name="sid" type="hidden" value=<%=tid %> >
	<tr></tr>
		<tr><td><label for='sid' style="color: white">Task Name:&nbsp;&nbsp; </label></td><td>&nbsp;<input id='sid' type="text" placeholder='Task Name' name='tname' autofocus="autofocus"></td></tr>
		<tr></tr><tr></tr>
		<tr><td><label for='sname' style="color: white">Task Date: &nbsp;&nbsp;</label></td><td>&nbsp;<input type="date" name='tdate'  id='sname'></td></tr>
		<tr></tr><tr></tr>
		<tr><td><label for='semail' style="color: white">Task Information:</label></td><td>&nbsp; <textarea name="tinfo" id='semail' rows="2" cols="22"></textarea></td></tr>
		<tr></tr><tr></tr>
		<tr><td><button type="submit" style="border-radius: 15px; width:80px;height: 35px;background-color: #adc178; border: 2px #283618 solid;">Add Task</button></td></tr>
	</table></fieldset>
</form>
</body>
</html>