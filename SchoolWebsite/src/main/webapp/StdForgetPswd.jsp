<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/SR.css">
</head>
<body>
<h1>Reset Password</h1>
<% 
		String Error = (String)request.getAttribute("Error");
        if(Error != null) {
%>
<p style="color:red;"><%= Error %></p>
<% } %>

<form action="StdPasswordResetBeforeLogin" method="Get" onsubmit="return validateForm()">


<label for="email"><b>Email:</b></label>
<input type="email" name="email" placeholder="Enter student's email" required>
<label for="password"><b>New Password:</b></label>
<input type="password" name="password1" id="password1" placeholder="Enter student's password" required>
<label for="password"><b>Confirm Password:</b></label>
<input type="password" name="password2" id="password2" placeholder="Re-enter student's password" required>

<input type="submit" value="Reset Password" class="registerbtn">

</form>
<div style="text-align: center;"><a href="http://localhost:8080/SchoolWebsite/StudentLogin.jsp">Log in</a></div>


<script src="js/SP.js"></script>
</body>
</html>