<%@ page import="java.util.List" %>
<%@ page import="com.SchoolWebsite.Beans.StudentRegisterBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="CSS/SP.css">
</head>
<body>
    <h1>Student Details</h1>
    <table>
        <tr>
         	<th>Serial NO.</th>
            <th>User Name</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Class</th>
            <th>Stream</th>
            
        </tr>
        <% 
            List<StudentRegisterBean> students = (List<StudentRegisterBean>) request.getAttribute("students");
        if (students != null && !students.isEmpty()) {
        	int count=0;
            for (int i = 0; i < students.size(); i++) {
            	StudentRegisterBean student = students.get(i);
            	count++;
%>
    <tr>
    	<td><%= count %></td>
        <td><%= student.getEmail() %></td>
        <td><%= student.getName() %></td>
        <td><%= student.getPhone() %></td>
        <td><%= student.getClas() %></td>
        <td><%= student.getStream() %></td>
        
    </tr>
<% 
            }
            } else {
        %>
            <tr>
                <td colspan="2">No students found.</td>
            </tr>
        <% } %>
    </table>
</body>
</html>