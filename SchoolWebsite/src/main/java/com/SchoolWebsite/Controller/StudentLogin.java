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
 * Servlet implementation class StudentLogin
 */
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
    
		StudentRegisterBean sb= new StudentRegisterBean();
		sb.setEmail(email);
		sb.setPassword(password);
		
		StudentDB sd= new StudentDB();
		String s2= sd.ReadStudent(sb);
		
		System.out.println(s2);
		if(s2!=null) {
			HttpSession session= request.getSession();
			session.setAttribute("sb", sb);
			session.setAttribute("name", s2);
			/*
			String regex="(.*)-(.*)-(.*)-(.*)-(.*)";
			String stdName=s2.replaceFirst(regex, "$1");
			String stdPhone=s2.replaceFirst(regex, "$2");
			String stdEmail=s2.replaceFirst(regex, "$3");
			String stdCls=s2.replaceFirst(regex, "$4");
			String stdStream=s2.replaceFirst(regex, "$5");
			
			
			session.setAttribute("name", stdName);
			session.setAttribute("phone", stdPhone);
			session.setAttribute("email", stdEmail);
			session.setAttribute("cls", stdCls);
			session.setAttribute("stream", stdStream);
			*/
			
			
			response.sendRedirect("http://localhost:8080/SchoolWebsite/StudentPage.jsp");
		}
		else {
			request.setAttribute("LoginError", "Incorrect password or wrong username");
			request.getRequestDispatcher("StudentLogin.jsp").forward(request, response);
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
