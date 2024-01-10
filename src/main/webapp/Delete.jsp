<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Data</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<h1>Delete  your Data:</h1>
<div class="container">

            <div class="col-md-5 col-md-offset-3">
                
                <form action="./delete">
                
                  <div class="form-group">
                        <label for="name"> Name:</label> <input type="text" class="form-control" id="name" placeholder=" Type your Name" name="name" required>
                    </div>

                    <input type="submit" value="Delete">

                </form>
               <p>Want to Log Out your account? <a href="Logout.jsp">Log Out</a></p>
            </div>
        </div>
</body>
</html>