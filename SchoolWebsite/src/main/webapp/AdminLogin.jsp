<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/SR.css">
</head>
<body>

<% 
        String errorMsg = (String)request.getAttribute("LoginError");
        if(errorMsg != null) {
%>
<p style="color:red;"><%= errorMsg %></p>
<% } %>

<h1>Enter your credentials to login</h1>

<form action="AdminLogin" method="Get">


<label for="aname"><b>User Name:</b></label>
<input type="email" name="aname" placeholder="Enter admin's username">
<label for="apassword"><b>Password:</b></label>
<input type="password" name="apassword" placeholder="Enter admin's password" required>

<input type="submit" value="Log in" class="registerbtn">

</form>


<script src="js/Logout.js"></script>
</body>
</html>