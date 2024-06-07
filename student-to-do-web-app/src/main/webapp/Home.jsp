<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body style="background-image: url('https://images.pexels.com/photos/20415541/pexels-photo-20415541/free-photo-of-a-red-and-black-bug-sitting-on-top-of-a-green-leaf.jpeg'); background-size: cover;">

<form action="Login" method="post" style="margin: 140px 510px">

<fieldset style="border: 1px solid white; border-radius: 25px;  backdrop-filter: blur(5px);">
	<legend style="color:white; margin-left: 30px; padding: 2px; width:50px;">Login</legend>
	
	<table cellspacing='10px' >
		<tr><td><label for="uname" style="color:white">UserId : </label></td><td><input  style="background-color: #a7c957" type="number" placeholder="your id" name="sid" id="uname" autofocus="autofocus"></td></tr>
	<tr></tr>
	<tr><td><label for="upswrd" style="color:white">Password : </label></td><td><input type="password" style="background-color: #a7c957" placeholder="your password" name="spswrd" id="upswrd"></td></tr>
	<tr></tr><tr></tr>
	<tr><td><a href="Student-Register.jsp"><button type="button" style="border-radius: 15px; width:80px;height: 40px;background-color: #a7c957; border: 2px #104911 solid">Register</button></a></td>
	<td><input type="submit" style="border-radius: 15px; margin-left:80px; width:80px;height: 40px;background-color: #a7c957; border: 2px #104911 solid"></td></tr>
	</table>	

</fieldset>

</form>
</body>
</html>