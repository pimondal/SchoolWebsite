<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/SP.css">
</head>
<body>
<%
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expire", "0");

String name= (String)session.getAttribute("name");


if(name==null){
	response.sendRedirect("http://localhost:8080/SchoolWebsite/StudentLogin.jsp");
}
%>

<% 
		String Error = (String)request.getAttribute("Error");
        if(Error != null) {
%>
<p style="color:red;"><%= Error %></p>
<% } %>
<% 
		String classError = (String)request.getAttribute("ClassError");
        if(classError != null) {
%>
<p style="color:red;"><%= classError %></p>
<% } %>

<h1>Welcome <%out.println(name);%>,</h1>
<div class="cls1">
<a href="LogOut" style="text-decoration: none;"><b>Log Out</b></a>
</div>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Options</span>

<div class="sidenav" id="mySidenav">
 <span class="closebtn" onclick="closeNav()">&times;</span>
  <a href="http://localhost:8080/SchoolWebsite/StudentPage.jsp">Home</a>
  <a href="StudentProfile">View Profile</a>
  <a href="javascript:void(0)" onclick="openForm()">Update Phone Number</a>
  <a href="javascript:void(0)" onclick="openFormA()">Update Name</a>
  <a href="javascript:void(0)" onclick="openFormB()">Update Class</a>
  <a href="#">Update Stream</a>
  <a href="javascript:void(0)" onclick="openFormC()">Reset Password</a>
  <a href="LogOut">Log Out</a>
</div>

<div class="form-popup" id="myForm1">
<a href="javascript:void(0)" class="closebtn" onclick="closeFormA()">&times;</a>
<br><br>
<form action="UpdateStdName" method="get" class="form-container">
    Updated Name: <input type="text" name="name" placeholder="Enter your name" pattern="[a-zA-z]+\s[a-zA-z]+" required>
    <br><br>
    <input type="submit" value="Update Name">
</form>
</div>
<div id="overlay" class="overlay" ></div>
<br>

<div class="form-popup" id="myForm2">
<a href="javascript:void(0)" class="closebtn" onclick="closeFormB()">&times;</a>
<br><br>
<form action="UpdateStdClass" method="get" class="form-container">
    New Class Name: <input type="text" name="cls" placeholder="Enter class name between 1-12" pattern="[1-9]|1[0-2]" required>
    <br><br>
    <input type="submit" value="Update Class">
</form>
</div>
<div id="overlay" class="overlay" ></div>
<br>

<div class="form-popup" id="myForm3">
<a href="javascript:void(0)" class="closebtn" onclick="closeFormC()">&times;</a>
<br><br>
<form action="ResetStdPassword" method="get" class="form-container" onsubmit="return validateForm()">
    New Password: <input type="password" id="password1" name="password1" placeholder="Enter new password" required>
    Confirm Password: <input type="password" id="password2" name="password2" placeholder="Re-enter password" required>
    <br><br>
    <input type="submit" value="Reset Password">
</form>
</div>
<div id="overlay" class="overlay" ></div>
<br>

<div class="form-popup" id="myForm">
<a href="javascript:void(0)" class="closebtn" onclick="closeForm()">&times;</a>
<br><br>
<form action="UpdateStdPhone" method="get" class="form-container">
    New Phone Number: <input type="text" name="phone" placeholder="Enter phone number" pattern="[0-9]{10}" required>
    <br><br>
    <input type="submit" value="Update Phone Number">
</form>
</div>
<div id="overlay" class="overlay" ></div>
<br>




<script src="js/SP.js"></script>
</body>
</html>