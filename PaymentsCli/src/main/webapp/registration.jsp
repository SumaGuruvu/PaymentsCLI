<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        body{
           display: flex;
           justify-content: center;
           text-align: center;
           color: peru;
           font-size: 20px;
           background-color: cornsilk;

        }
        form{
            border: 1px solid peru;
            width: 500px;
            background-color:honeydew;
        }
        label {
             display: inline-block;
             width: 300px;
             text-align: right;
             }
        
</style>
</head>
   <body>
      
       <form action="http://localhost:8081/PaymentsCli/Registrationservlet" method="post">
        <h3>Registration</h3><br><br>
        <label>PhoneNumber</label>
        <input type="text" name="phno"><br><br>
        <label>Email</label>
        <input type="email" name="email"><br><br>
        <label>FirstName</label>
        <input type="text" name="firstname"><br><br>
        <label>LastName</label>
        <input type="text" name="lastname"><br><br>
        <label>DateOfBirth</label>
        <input type="date" name="dob"><br><br>
        <label>Password</label>
        <input type="password" name="password"><br><br>
        <input type="submit" value="register">
       </form>
   </body>
</html>