<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payement Here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script type="text/javascript">
   $(function) () {
	   $("#money").money();
   });
   
</script>
</head>
<body>
	<div class="container">

		<h2>Course Details Form:</h2>
		<div class="col-md-5 col-md-offset-3">

			<form method="post" action="./money">

				<div class="form-group">
					<label for="cardnum">Card Number:</label> <input type="text"
						class="form-control" id="cardnum" placeholder="###-###-### "
						name="cardnum" required>
				</div>

				<div class="form-group">
					<label for="day">Day:</label> <input type="text"
						class="form-control" id="day" placeholder="Enter date number"
						name="day" required>
				</div>

				<div class="form-group">
					<label for="mas">Choose a Month:</label> <input type="text"
						class="form-control" id="mas" name="mas"
						required>
				</div>
				
			 	<div class="form-group">
				<label for="mas">Year:</label>
				<input type="text" class="form-control" id="sal" placeholder="Enter year" name="sal"
						required >
				</div> 
				<div class="form-group">
					<label for="cvv">CVV number:</label> <input type="text"
						class="form-control" id="cvv" placeholder="xxx" name="cvv"
						required>
				</div>

				<div class="form-group">
					<label for="cardholder">Card Holder name:</label> <input
						type="text" class="form-control" id="cardholder"
						placeholder="Enter your name" name="cardholder" required>
				</div>

				<div class="form-group">
					<label for="cardholder">City:</label> <select name="city">
						<option value="pune">Pune</option>
						<option value="kolkata">Kolkata</option>
						<option value="delhi">Delhi</option>
						<option value="hydrabad">Hydrabad</option>
					</select>
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>&nbsp;&nbsp;&nbsp;&nbsp;
				  <input type="reset" class="btn btn-danger" value="Reset">
			</form>

		</div>
	</div>

</body>
</html>