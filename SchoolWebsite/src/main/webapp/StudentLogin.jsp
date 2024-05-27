<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/SR.css">
</head>
<body>
<h1>Enter your credentials to login</h1>
<%  


        String errorMessage = (String)request.getAttribute("LoginError");
        if(errorMessage != null) {
%>
<p style="color:red;"><%= errorMessage %></p>
<% } %>

<form action="StudentLogin" method="Get">


<label for="email"><b>Email:</b></label>
<input type="email" name="email" placeholder="Enter student's email" required>
<label for="password"><b>Password:</b></label>
<input type="password" name="password" placeholder="Enter student's password" required>

<input type="submit" value="Log in" class="registerbtn">

</form>
<div style="text-align: center;"><a href="http://localhost:8080/SchoolWebsite/StdForgetPswd.jsp">Forget Password</a></div>

<script src="js/Logout.js"></script>
</body>
</html>