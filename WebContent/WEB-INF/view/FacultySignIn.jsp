<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>

<title>Drexel Academics</title> 
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
body{
	background-image: url(inside.jpg);
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
	width: 300px;
	height: 280px;
}

.content{
	position: absolute;
	top: 28%;
	left: 40%;
}

</style>
</head>

<body>
<div class="content" id="id01">
  
  <form:form id="faculty" action="loginfaculty" modelAttribute="Faculty" method="post">
    <p style="color:darkblue"><b>DREXEL ACADEMICS</b><p>
    <p><b>Faculty</b><p>
    <p>Enter your credentials to login:</p>
    <div>
      <label>Username:</label>
      <form:input type="text" placeholder="Enter Username" name="username"  path="userName" required="required"/><br>

      <label>Password:</label>
      <form:input type="password" placeholder="Enter Password" name="psw" path="password" required="required" /><br><br>
        
      <form:button type="submit" id="faculty" name="faculty">Login</form:button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label><br><br>

      <button type="button">Cancel</button>
      <span>Forgot <a href="#">password?</a></span>
    </div>
  </form:form>
  <table align="center">
                <tr>
                    <td style="font-style: italic; color: white; font-size:10px;">${message}</td>
                </tr>
            </table>
</div>
</body>

</html>