<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

  <head>

  		<title> Welcome to Sign Up Page </title>
        <style>
        h1 {text-align :center;}
        h3 {text-align :center;}
        input {
            width:200px;
            display: inline-block;
            }
        body {
              width:1700px;
              length:1000px;
              background-color: #f0f2f5;}
        </style>

  </head>


  <body>
    <br>
    <h1> TechQuiz World </h1> 
    <br>
    <h3> TechQuiz World SignUp </h3>
    <br>
    <form action ="/newUser/addNewUserByParameter" method ="post" >
    <b><h3>RollNo :
    <input type = "text "  name ="rollNo"> </h3> <b>
    <br>
    <b><h3>FirstName :
    <input type = "text " name ="firstName"> </h3> <b>
    <br>
    <b><h3>LastName :
    <input type = "text " name ="lastName"> </h3><b>
    <br>
    <b><h3>Gender :
    <input type = "text"name ="gender"></h3><b>
    <br>
    <b><h3>DateOfBirth :
    <input type = "date" name ="dateOfBirth"> </h3><b>
    <br>
    <b><h3>Email Id :       
    <input type = "text "name ="email"> </h3><b>
    <br>
    <b><h3>Password :
    <input type = "password"  name ="password"></h3><b>
    <br>
    <h3> <button> Submit </button> </h3>
	</form>
  </body>


</html>
