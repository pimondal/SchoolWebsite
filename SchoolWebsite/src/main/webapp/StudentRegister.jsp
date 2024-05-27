<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/SR.css">
</head>
<body>

<% 
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expire", 0);

        String cnfMsg = (String)request.getAttribute("LoginCnf");
        if(cnfMsg != null) {
%>
<p style="color:red;"><%= cnfMsg %></p>
<% } %>

<h1>Register the students here</h1>

<form action="Register" method="Post">

<label for="name"><b>Name:</b></label>
<input type="text" name="name" placeholder="Enter student's name" required>
<label for="email"><b>Email:</b></label>
<input type="email" name="email" placeholder="Enter student's email">
<label for="phone"><b>Phone Number:</b></label>
<input type="tel" name="phone" placeholder="Enter student's phone number" pattern="[0-9]{10}">
<label for="cls"><b>Class:</b></label>
<input type="text" name="cls" placeholder="Enter student's class 1-12" required pattern="[1-9]|1[0-2]">
<span id="error" style="color: red;"></span>
<label for="stream"><b>Stream:</b></label>
<input type="text" name="stream" placeholder="Enter student's stream">
<label for="password"><b>Password:</b></label>
<input type="password" name="password" placeholder="Enter student's password" required>

<input type="submit" value="Add Student" class="registerbtn">

</form>



</body>
</html>