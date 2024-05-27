<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/AP.css">
</head>
<body>

<%
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expire", "0");

String name= (String)session.getAttribute("aname");

if(name==null){
	response.sendRedirect("http://localhost:8080/SchoolWebsite/AdminLogin.jsp");
}
%>
<% 
		String Error = (String)request.getAttribute("Error");
        if(Error != null) {
%>
<p style="color:red;"><%= Error %></p>
<% } %>

<h1>Welcome Admin</h1>
<div class="topnav">
	<a href="http://localhost:8080/SchoolWebsite/AdminPage.jsp">Home</a>
 <div class="dropdown">
    <button class="dropbtn">Student</button>
    <div class="dropdown-content">
      	<a class="active" href="http://localhost:8080/SchoolWebsite/StudentRegister.jsp">Add Student's Details</a>
       	<a href="javascript:void(0)" onclick="openForm()">Delete A Student</a>
      	<a href="ViewAllStudents">View All Students</a>
    </div>
  </div> 
   
  
 <div class="dropdown">
    <button class="dropbtn">Teacher</button>
    <div class="dropdown-content">
     	<a href="#teacher">Add Teacher's Details</a>
    	<a href="#teacher">Delete A Teacher</a>
      	<a href="#">View All Teachers</a>
    </div>
  </div> 
  <a href="LogOut" style="float:right">Log Out</a>
  
</div>


<br>
<div style="float:center">
<div class="slideshow-container">
<div class="mySlides fade">
 
  <img src="Images\midnapore_town_school.jpg" style="width:580px;height:320px">
  
</div>
<div class="mySlides fade">
  
  <img src="Images\FB_IMG_15902557654002487.jpg" style="width:580px;height:320px">
  
</div>

<div class="mySlides fade">
  
  <img src="Images\FB_IMG_15902559008712002.jpg" style="width:580px;height:320px">
  
</div>
</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

</div>

<div class="form-popup" id="myForm">
<a href="javascript:void(0)" class="closebtn" onclick="closeForm()">&times;</a>
<br><br>
<form action="RemoveStudent" method="get" class="form-container">
    Enter student username: <input type="email" name="email" placeholder="Enter username" required>
    <br><br>
    <input type="submit" value="Delete Student">
</form>
</div>
<div id="overlay" class="overlay" ></div>
<br>


<script src="js/Loigic.js"></script>
</body>
</html>