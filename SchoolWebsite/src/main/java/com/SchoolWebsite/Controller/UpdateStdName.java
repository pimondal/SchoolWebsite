package com.SchoolWebsite.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SchoolWebsite.Beans.StudentRegisterBean;
import com.SchoolWebsite.Model.StudentDB;

/**
 * Servlet implementation class UpdateStdName
 */
public class UpdateStdName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStdName() {
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
	            
	            String name = request.getParameter("name");
	            
	        
	            
	            	// Update phone number
	            	sb2.setName(name);
	            	String S4= sd.UpdateStdName(sb2);
	            	System.out.println(S4);
	            	System.out.println(name);
	            	System.out.println(sb2.getName()+" After setting usp");
	            	

	            	if (S4.equalsIgnoreCase("Updated")) {
	            		
	            		response.sendRedirect("http://localhost:8080/SchoolWebsite/StudentPage.jsp"); 
	            	} 
	            	else if(S4.equalsIgnoreCase("Same Name")) {
	            		request.setAttribute("Error", "Entered name is same as the existing one.");
	        			request.getRequestDispatcher("StudentPage.jsp").forward(request, response);
	            	}
	            	else {
	            		// Error occurred while updating phone number in the database
	            		
	            		request.setAttribute("Error", "Incorrect Data.");
	        			request.getRequestDispatcher("StudentPage.jsp").forward(request, response);
	            	}
	        
	        } else {
	            
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
