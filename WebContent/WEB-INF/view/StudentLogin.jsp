<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
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
	background-image: url("blackboard.jpg");
	background-repeat: no-repeat;
	background-size: cover;
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

.navbar-header{
	  height: 120px;
      
	}

.col-sm-3,.col-sm-9{
    height: 60vh;
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
.row1{
    height: 40px;
    font-size: 30px;
    color: white;
    line-height: 10px;
}

img{
      height: 120px;
    }
    
footer{
	background-color: darkblue;
    color: yellow;
    height: 45px;
    line-height: 40px;
}
</style>
</head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <img src="https://drexel.edu/~/media/Images/identity/athletics/athletics_primary.ashx?la=en">
    </div>
    <div class="col-sm-10" id="myNavbar">
        <div class="col-xs-10"><p><b>DREXEL ACADEMICS</b></p></div>
        <div class="col-xs-2" style="font-size:20px;"><p><a href="SignIn">Sign Out</a></p></div>
    </div>
  </div>
</nav>

<div class="container-fluid text-center">    
  <div class="row row1">Welcome!</div>
</div>
    
<div class="container-fluid text-center">    
  <div class="row content" >
    <div class="col-sm-3" > 
      <h1> ${firstname} </h1><br>
      <p>Please select the courses you want to study:</p>
      <p>Add 3 Courses from the following:</p>
      <p>CS510 Artificial Intelligence</p>
      <p>CS521 Data Structures</p>
      <p>SE575 Software Design</p>
      <p>CS536 Computer Graphics</p>
    </div>
    <form:form action="addcourse" modelAttribute="course" method="post">
    <div class="col-sm-9 text-left" style="display:none" id="assignment">
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label path="universityID">University ID:</label>
      </div>
      <div class="col-xs-7">
        <form:input type="text" placeholder="University ID" path="universityID" required="required"/>
      </div>
    </div> 
      
      <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label path="courseId1">Course 1:</label>
      </div>
      <div class="col-xs-7">
        <form:input type="text" placeholder="Course ID_Name" path="courseId1" required="required"/>
      </div>
    </div>
    
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label path="courseId2">Course 2:</label>
      </div>
      <div class="col-xs-7">
        <form:input type="text" placeholder="Course ID_Name" path="courseId2" required="required"/>
      </div>
    </div>
    
    <div class="row">
      <div class="col-xs-2"></div>
      <div class="col-xs-2">
        <label path="courseId3">Course 3:</label>
      </div>
      <div class="col-xs-7">
        <form:input type="text" placeholder="Course ID_Name" path="courseId3" required="required"/>
      </div>
    </div>
    <div class="row">
    <div class="col-xs-4"></div>
    <div class="col-xs-4"><input type="submit" value="Submit"></div>
    </div>
    </div>
    </form:form>
    <table align="center">
                <tr>
                    <td style="font-style: bold; color: white; font-size:20px;">${message}</td>
                </tr>
            </table>
  </div>
</div>
<footer class="container-fluid text-center">
  <p>Copyright © 2018 Drexel Academics. All rights reserved.</p>
</footer>

</body>

</html>

