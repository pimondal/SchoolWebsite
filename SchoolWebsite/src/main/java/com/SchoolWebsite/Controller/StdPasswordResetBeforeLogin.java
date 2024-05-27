package com.SchoolWebsite.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.SchoolWebsite.Beans.StudentRegisterBean;
import com.SchoolWebsite.Model.StudentDB;

/**
 * Servlet implementation class StdPasswordResetBeforeLogin
 */
public class StdPasswordResetBeforeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StdPasswordResetBeforeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		 StudentDB sd= new StudentDB();
		 StudentRegisterBean sb= new StudentRegisterBean();

	       
		 			String email = request.getParameter("email");
	            	String password = request.getParameter("password1");
	            
	            	// Updating password
	            	sb.setPassword(password);
	            	sb.setEmail(email);
	            	String S4= sd.StdPasswordResetBeforeLogin(sb);
	            	System.out.println(S4);
	            	System.out.println(password);
	            	System.out.println(sb.getPassword()+" After setting usp");
	            	

	            	if (S4.equalsIgnoreCase("Updated")) {
	            		
	            		//response.sendRedirect("http://localhost:8080/SchoolWebsite/StdForgetPswd.jsp");
	            		request.setAttribute("Error", "Password updated successfully.");
	        			request.getRequestDispatcher("StdForgetPswd.jsp").forward(request, response);
	            	} 
	            	else if(S4.equalsIgnoreCase("Same Password")) {
	            		request.setAttribute("Error", "Entered password is same as the existing one. Try new one.");
	        			request.getRequestDispatcher("StdForgetPswd.jsp").forward(request, response);
	            	}
	            	else if(S4.equalsIgnoreCase("Invalid Username")) {
	            		request.setAttribute("Error", "Incorrect username");
	        			request.getRequestDispatcher("StdForgetPswd.jsp").forward(request, response);
	            	}
	            	else {
	            		// Error occurred while updating phone number in the database
	            		
	            		request.setAttribute("Error", "Incorrect Data.");
	        			request.getRequestDispatcher("StdForgetPswd.jsp").forward(request, response);
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
