<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
<script>
function openWin() {
  window.open("Payement.jsp");
}
</script>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

 <body class="py-2">
 <h1>Courses Details</h1>
      <div class="jumbotron container mt-4 bg-light p-5">
        <img class="float-start img-fluid me-3" src="java.jpg" alt="my pic" style="max-width: 10%;">
        <h1 class="display-4">Java Course</h1>
        <p class="lead"><i>In this courses we will learn basic java to advanced java.</i></p>
        <hr class="my-4">
        <p>This courses will be <b>6</b> months long,weekend Batch</p>
        <a class="btn btn-primary btn-lg" href="#" role="button" onclick="openWin()" id="Java">Purchase</a>
        
      </div>
      
      <div class="jumbotron container mt-4 bg-light p-5">
        <img class="float-start img-fluid me-3" src="python.jpg" alt="my pic" style="max-width: 10%;">
        <h1 class="display-4">Python Course</h1>
        <p class="lead"><i>In this courses we will learn basic python to advanced python.</i></p>
        <hr class="my-4">
        <p>This courses will be <b>5</b> months long,weekend Batch</p>
        <a class="btn btn-primary btn-lg" href="#" role="button" onclick="openWin()" id="Python">Purchase</a>
      </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

   
  
  </body>
</html>