<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>

<title>Drexel Academics</title> 
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<style>
body{
	background-image: url("inside.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	text-align: center;
}

a{
 color:white;
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
  
  <form:form action="login" modelAttribute="Student" id="loginform" method="post">
    <p style="color:darkblue"><b>DREXEL ACADEMICS</b><p>
    <p><b>Student</b><p>
    <p>Enter your credentials to login:</p>
    <div>
      <label> Username: </label>
      <form:input type="text" placeholder="Enter Username" path="userName" name="username" required="required"/><br>

      <label>Password:<label>
      <form:input type="password" placeholder="Enter Password" path="password" name="password" required="required"/><br>
    
      <form:button type="submit" id="Student" name="Student">Login</form:button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label><br><br>

      <button type="reset">Cancel</button>
      <span><a href="http://localhost:8080/Notification/">Home Page</a></span>
    </div>
  </form:form>
  
  <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
</div>
</body>

</html>