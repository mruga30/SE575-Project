<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
        <title>Home Page</title>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.5.0/css/all.css' integrity='sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU' crossorigin='anonymous'>
        <style type="text/css">
          html,body{
                min-height: 100%;
            }
            body {
    background-image: url("blackboard.jpg");  
    background-position: center;
    background-size: cover;
}
a{
 color: white;
 
}


img{
    display: block;
    margin-left: auto;
    margin-right: auto;
}
.block{
    display: block;
    margin-left: auto;
    margin-right: auto;
    margin-top: 100px;
    width: 400px;
    height: 50px;
    padding: 5px;
    border: 1px #07294D;    
    background-color: #07294D;
    color: white;
    font-size: 30px;
    text-align: center;
   
}  
     </style>
    </head>
    <body>
            <div class="row">
                <div class="col-md-6" style="margin-top: 10px;">
                    <span><img src="DLOGO.png"/></span>
                </div>
            </div>
        <div class="row">
            <div class="col-md-6">
                <span class="block"><b>SIGN-IN | <a href="SignIn"><span class="glyphicon glyphicon-education"></a> | <a href="FacultySignIn"><i class='fas fa-chalkboard-teacher' style='font-size:24px'></i></a></b></span>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <span class="block"><b><a href="SignUp">SIGN-UP</a></b></span>
            </div>
        </div>
    </body>
</html>