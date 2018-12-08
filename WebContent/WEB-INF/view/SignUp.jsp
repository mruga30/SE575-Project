<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>

<title>Drexel Academics</title> 

<style>
body{
	background-image: url("outside.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	text-align: center;
}

input[type=text], input[type=password] {
    padding: 6px 10px;
    margin: 4px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
form{
	background-color: rgba(192,192,192,0.9);
	border: 1px solid #ccc;
	width: 350px;
	height: 350px;
}

.content{
	position: absolute;
	top: 22%;
	left: 37%;
}

</style>
</head>

<body>
<div class="content" id="id01">
  
  <form:form action="signup" modelAttribute="sign" method="post" id="signupform">
    <p style="color:darkblue"><b>DREXEL ACADEMICS</b><p>
    <p>Please fill the details below to create an account:</p>
    <div>
      <label>University ID:</label>
      <form:input type="text" placeholder="University ID" path="universityID" name="uid" required="required"/><br>
      
      <label>First Name:</label>
      <form:input type="text" placeholder="First Name" path="firstName" name="fname" required="required"/><br>

      <label>Last Name:</label>
      <form:input type="text" placeholder="Last Name" path="lastName" name="lname" required="required"/><br>

      <label> Email ID: </label>
      <form:input type="text" placeholder="Email id" path="emailId" name="ename" required="required"/><br>

      <label>Username:</label>
      <form:input type="text" placeholder="Enter Username" path="userName" name="uname" required="required"/><br>

      <label>Password:</label>
      <form:input type="password" placeholder="Enter Password" path="password" name="psw" required="required"/><br>
	
      <button type="submit">Register</button>
    </div><br>

  </form:form>
</div>
<script>
</script>
</body>

</html>
