<html>
<head>
<link rel="stylesheet" type="text/css" href="CSS/SP.css">
</head>
<body>
<%

String name= (String)session.getAttribute("name");
String email=(String)session.getAttribute("email");
String stream=(String)session.getAttribute("stream");
String cls=(String)session.getAttribute("cls");
String phone=(String)session.getAttribute("phone");


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




<h1>Welcome <%out.println(name);%>,</h1>
<div class="cls1">
<a href="LogOut" style="text-decoration: none;"><b>Log Out</b></a>
</div>

<table>
        <tr>
            <th>User Name</th>   
             <td><%out.println(email);%></td>
         </tr>
        <tr>
            <th>Email ID</th>   
             <td><%out.println(email);%></td>
         </tr>
          <tr>
            	<th>Name</th>
           
                <td><%out.println(name);%></td>
             </tr><tr>
             	<th>Class</th>
            	
                <td><%out.println(cls);%></td>
             </tr><tr>
             	<th>Stream</th>
            
                <td><%out.println(stream);%></td>
             </tr><tr>
             	<th>Phone Number</th>	
                <td><%out.println(phone);%></td>
                
            </tr>
        
</table>


<script src="js/SP.js"></script>
</body>
</html>