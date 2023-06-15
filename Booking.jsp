<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Booking</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Plugins/Boostrap.css">
<link rel="stylesheet" href="Script/Common.css">
<script src="Plugins/jQuery.js"></script>
<script src="Plugins/bootstrap.js"></script>
<script src="Script/Booking.js"></script>
</head>
<body>
	<div style="height: 100vh; background-color: #4169E1;">
		<div></div>
		<!-- Modal -->
		<div class="modal fade" data-backdrop="static" id="mdlCustomerDetail"
			role="dialog">
			<div class="modal-dialog" style="width: 70%;">
				<!-- Modal content-->
				<div class="modal-content">
					<div class="modal-body">
						<div class="Title form-group" style="text-align: center;">Please
							enter your booking information</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Name</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idName">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Address</label>
							</div>
							<div class="col-xs-6">
								<textarea class="form-control" id="idAddress"></textarea>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>NRIC</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idNRIC">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Usage Trade</label>
							</div>
							<div class="col-xs-6">
								<select class="form-control" name="UsageTrade" id="idUsageTrade">
									<option value="Credit Card Promotion">Credit Card
										Promotion</option>
									<option value="F&B">F&B</option>
									<option value="Hairdressing">Hairdressing</option>
									<option value="Clothing">Clothing</option>
									<option value="Others">Others</option>
								</select>
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Others</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idOthers">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Email</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idEmail">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Home</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idHomeTel">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Office</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idOfficeTel">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Mobile</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="text" id="idMobile">
							</div>
						</div>
						<div class="row form-group">
							<div class="col-xs-3 RightAlign">
								<label>Booking Date</label>
							</div>
							<div class="col-xs-6">
								<input class="form-control" type="date" id="idBookingDate">
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary">Book Slot</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
