package com.SchoolWebsite.Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.SchoolWebsite.Beans.AdminBean;

import com.SchoolWebsite.Model.AdminDB;


/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		String aname = request.getParameter("aname");
		String apassword = request.getParameter("apassword");
    
		AdminBean ab= new AdminBean();
		ab.setAname(aname);
		ab.setApassword(apassword);
		
		AdminDB ad= new AdminDB();
		String s2= ad.ReadAdmin(ab);
		
		System.out.println(s2);
		if(s2.equalsIgnoreCase("success")) {
			
			HttpSession session= request.getSession();
			session.setAttribute("aname", aname);
			
			response.sendRedirect("http://localhost:8080/SchoolWebsite/AdminPage.jsp");
		}
		else {
			request.setAttribute("LoginError", "Incorrect password or wrong username.");
			request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
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
