<%@page import="com.ccs.student_to_do_web_app.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Home Page</title>
<style type="text/css">
*{
margin: 0px;
padding: 0px;
}
button {
	width:250px;
	height: 50px;
	border-radius: 15px;
	background-color: transparent;
	border: 2px white solid;
	font-size: 20px;
	color:white;
	backdrop-filter: blur(3px);
	
}
button:hover {
	background-color: #b8c0ff;
	color:black;
	border: 2px #104911 solid;
	
	
}
button:active {
	background-color: #0f4c5c
}
 .Div-1{
	background-image: url("https://images.pexels.com/photos/1268129/pexels-photo-1268129.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
	background-size:100% 100% ;
	background-repeat: no-repeat;
	width:100vw;
	height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	
	
}
span{
color: white;
border: 2px #104911 solid; 
border-radius: 25px;
font-size: 16px;
}
.Div-2{
width:13%;
}
</style>
</head>
<body>
	<div class="Div-1" ><div class="Div-2">
		<a href="TAsk.jsp?sid=<%=request.getAttribute("student") %>"><button>Add Your Task</button></a><br><br><br><br>
		<a href="Display.jsp?sid=<%= request.getAttribute("student")%>"><button>Display Your Task</button></a>
		
		
		<br><br><br> <form action="DisplayDate"><br><span>&nbsp; Display by Your date &nbsp; :- &nbsp;   </span> <br><br>
		 <input type="date" name="tdate" style="border:2px #104911 solid; border-radius: 15px; color: green;width:190px; height: 30px;"><br><br>
		 
		 <input type="number" value="<%=request.getAttribute("student") %>" name="sid" hidden="hidden" >
		 <button>Display</button>
		 </form></div></div>
		
	
</body>
</html>