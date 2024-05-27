package com.SchoolWebsite.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SchoolWebsite.Beans.StudentRegisterBean;
import com.SchoolWebsite.Model.StudentDB;

/**
 * Servlet implementation class StudentProfile
 */
public class StudentProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session2 = request.getSession();
		StudentRegisterBean sb2 = (StudentRegisterBean) session2.getAttribute("sb");
		
		StudentDB sd= new StudentDB();
		
		 if (sb2 != null) {
	        
		 StudentRegisterBean srb = sd.fetchStudentDetails(sb2);
	      
	        // Set user details as request attribute
	        request.setAttribute("srb", srb);
	        StudentRegisterBean userDetails = (StudentRegisterBean) request.getAttribute("srb");
	        // Display user details
	        if (userDetails != null) {
	        	String stdName= userDetails.getName();
	        	String stdEmail= userDetails.getEmail();
	        	String stdPhone= userDetails.getPhone();
	        	String stdClass= userDetails.getClas();
	        	String stdStrem= userDetails.getStream();
	        	
	        	HttpSession session= request.getSession();
	        	session.setAttribute("name", stdName);
	        	session.setAttribute("email", stdEmail);
	        	session.setAttribute("phone", stdPhone);
	        	session.setAttribute("cls", stdClass);
	        	session.setAttribute("stream", stdStrem);
	        	
	            
	        } else {
	        	request.setAttribute("Error", "Something Wrong!!");
	 			request.getRequestDispatcher("StudentPage.jsp").forward(request, response);
	        }
	        
	        // Forward to JSP to display user details
	        RequestDispatcher dispatcher = request.getRequestDispatcher("StudentProfile.jsp");
	        dispatcher.forward(request, response);
		 }
		 else {
     		
			 response.sendRedirect("http://localhost:8080/SchoolWebsite/StudentLogin.jsp");
     		
     	}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 
	    
		
	}

}
