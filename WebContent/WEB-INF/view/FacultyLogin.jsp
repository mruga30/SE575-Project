<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">

<head>
  <title>Drexel Academics</title> 
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  


<style>
body{
	background-image: url("https://relationalschools.org/wp-content/uploads/2017/01/blackboard-wallpaper-3-600x400.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}

a{
color: white;
}
input[type=text], input[type=password], input[type=datetime-local] {
    padding: 6px 10px;
    margin: 4px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

.row1{
    height: 30px;
    font-size: 30px;
    color: white;
    line-height: 10px;
}

.navbar-header{
	  height: 120px;
      
	}

.col-sm-3,.col-sm-9{
    height: 65vh;
    background-color: rgba(255,200,0,0.8);
    border: 1px solid #ccc;
}

.col-sm-10{
	color:yellow;
    font-size: 30px;
    text-align: left;
    line-height: 120px;
    } 
   
.navbar{
	background-color: darkblue;
}
    
img{
      height: 120px;
    }

footer{
	background-color: darkblue;
    color: yellow;
    height: 40px;
    line-height: 20px;
}

</style>
</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <img src="https://drexel.edu/~/media/Images/identity/athletics/athletics_primary.ashx?la=en" >
    </div>
    <div class="col-sm-10" id="myNavbar">
        <div class="col-sm-10"><p><b>DREXEL ACADEMICS</b></p></div>
        <div class="col-xs-2" style="font-size:20px;"><p><a href="FacultySignIn">Sign Out</a></p></div>
    </div>
  </div>
</nav>

<div class="container-fluid text-center">    
  <div class="row row1">Welcome!</div>
</div>

<div class="container-fluid text-center">    
  <div class="row content" >
    <div class="col-sm-3" > 
      <h1>${firstname}</h1><br>
      <p>Please enter the Student ID to whom you want to send email:</p>
      <form:form action="mail" modelAttribute="sendmail" method="post">
      <label>University ID:</label>
	<form:input type="text" placeholder="Uni_ID" path="universityID"/><br><br>
	
          <p>Add Assignment on the right side and send the email using the button below:</p>
          <input type="submit" value="Send Email">
    </div>
    </form:form>
    <table align="center">
                <tr>
                    <td style="font-style: bold; color: White; font-size: 20px;">${message}</td>
                </tr>
            </table>
    <div class="col-sm-9 text-left"><br>
      <div class="row">   
    <form:form action="assign" modelAttribute="assignment" method="post">
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label>Course ID :</label>
      </div>
      <div class="col-xs-7">
        <form:input type="text" placeholder="Course ID" path="courseId"/>
      </div>
    </div>
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label>Assignment Name:</label>
      </div>
      <div class="col-xs-7">
        <form:input type="text" placeholder="Topic Name" path="topic"/>
      </div>
    </div>
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label>Assignment Description:</label>
      </div>
      <div class="col-xs-7">
        <form:textarea placeholder="Describe in detail the tasks.." path="description" style="height:200px;width:300px;padding:6px 10px;"></form:textarea>
      </div>
    </div>
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label>Assignment Deadline:</label>
      </div>
      <div class="col-xs-7">
        <form:input type="date" path="date"/>&nbsp;<form:input type="time" path="time"/>
      </div>
    </div>
    <br><br>
    <div class="row">
    <div class="col-xs-4"></div>
    <div class="col-xs-4"><input type="submit" value="Submit"></div>
    </div>
    </form:form>
    <table align="center">
                <tr>
                    <td style="font-style: bold; color: white; font-size:20px;">${message}</td>
                </tr>
            </table>
    </div>
  </div>
</div>
<footer class="container-fluid text-center">
  <p>Copyright © 2018 Drexel Academics. All rights reserved.</p>
</footer>

</body>

</html>
