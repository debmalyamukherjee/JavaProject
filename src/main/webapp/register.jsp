<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<div class="container">

            <h2>User Register Form:</h2>
            <div class="col-md-5 col-md-offset-3">
                
                <form action="./register">

                    <div class="form-group">
                        <label for="name"> Name:</label> <input type="text" class="form-control" id="name" placeholder=" Type your Name" name="name" required>
                    </div>

                    <div class="form-group">
                        <label for="password">Password:</label> <input type="password" class="form-control" id="password" placeholder="Enter your password" name="password" required>
                    </div>

                    <div class="form-group">
                        <label for="course">Course:</label> <input type="text" class="form-control" id="course" placeholder="Enter Course" name="course" required>
                    </div>

                    <div class="form-group">
                        <label for="country">Country:</label> <input type="text" class="form-control" id="country" placeholder="Enter Country" name="country" required>
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>

                </form>
               <p>Already have an account? <a href="signup.jsp">Sign Up</a></p>
            </div>
        </div>
</body>
</html>