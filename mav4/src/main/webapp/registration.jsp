<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
#name{
text-align:center;
background-color: black;
padding:2px;
color:white;
}
</style>

<form action ="registration" method = "post">
<div id ="name">
<h1>Registration</h1>


<label>fullname</label>
<input type="text" name="fullname"><br></br>


<label>emailid</label>
<input type="text" name="emailid"><br></br>


<label>contact</label>
<input type="text" name="contact" ><br></br>



<label>password</label>
<input type="text" name="password"><br></br>


<label>confirmpassword</label>
<input type="text" name="confirmpassword"><br></br>

<br>
<br>
<br>
<input type = "submit" value="submit">

<br>

</form>
</div>
</body>
</html>