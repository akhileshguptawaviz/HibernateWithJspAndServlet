<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
<link href="form.css" rel="stylesheet">
</head>
<body>




<center><h1><a href="Signup.jsp">Create Account</a></h1></center>
                                                           
<center>
<div class="f_box">
	<div class="f_box1">
<br>
<img src="image/lock.png" height="120px" width="120px">
<form method="get" action="LoginServlet" name="myForm">
    <p><input type="text" name="uname" class="txt" placeholder="User Name" required></p>
    <p><input type="text" name="mail" class="txt" placeholder="User Email" required></p>
    <p><input type="password" name="pass" class="txt" placeholder="User Password" required></p>
    <p><input type="submit" name="log" value="Login" class="btn"></p>
</form>
</div>
</div>


</center>


</body>

</html>