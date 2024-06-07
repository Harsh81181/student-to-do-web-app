<html>
<title>Student Registration</title>
<body style="background-image: url('https://images.pexels.com/photos/326055/pexels-photo-326055.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'); background-size: cover;">

<form action="RegisterStudent" method="post" style='margin:70px 480px; '>
	<fieldset style="border: 1px solid white; border-radius: 30px;  backdrop-filter: blur(5px);">
<table cellspacing='10px'>
		<legend style="color:white; margin-left: 80px; padding: 2px; width:150px;">Student Registration</legend>
		<tr></tr><tr><td><label for='sid' style="color:white;">Student ID : </label></td><td><input type="number" style="background-color: #caf0f8" placeholder='studentid' name='sid' autofocus="autofocus"></td></tr>
		
		<tr></tr><tr><td><label for='sname' style="color:white;">Student Name : </label></td><td><input type='text' style="background-color: #caf0f8" name='sname' placeholder='studentname' id='sname'></td></tr>
		
		<tr></tr><tr><td><label for='semail' style="color:white;">Student Email : </label></td><td><input type='email' style="background-color: #caf0f8" name='semail' placeholder='studentemail' id='semail'></td></tr>
		
		<tr></tr><tr><td><label for='spswrd' style="color:white;">Password : </label></td><td><input type="password" style="background-color: #caf0f8" name='spswrd' placeholder='studentpassword' id='spswrd'></td></tr>
	
		<tr></tr><tr><td><label style="color:white;">Gender :</label></td>
		<th ><input type="radio" name="gender" value="m"> Male
		<input type="radio" name="gender" value="f"> Female
		<input type="radio" name="gender" value="o"> Other</td></tr>
		<tr></tr>
		<tr></tr>
		<tr><td colspan="2"><button type="submit" style="margin:0 0 0 120px; background-color: #caf0f8;border-radius: 10px; width:90px;height: 40px; border: 1px solid black; font-size:17px ">Register</button></td></tr>
	</table></fieldset>
</form>
</body>
</html>
