package com.SchoolWebsite.Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SchoolWebsite.Beans.StudentRegisterBean;
import com.SchoolWebsite.Model.StudentDB;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String cls = request.getParameter("cls");
		String stream = request.getParameter("stream");
	      
		    
		StudentRegisterBean sb= new StudentRegisterBean();
		sb.setName(name);
		sb.setEmail(email);
		sb.setPassword(password);
		sb.setPhone(phone);
		sb.setClas(cls);
		sb.setStream(stream);
		
		
		StudentDB sd=new StudentDB();
		String s1=sd.insertStudent(sb);
		
		System.out.println(s1);
		if(s1.equalsIgnoreCase("Data Inserted")) {
		request.setAttribute("LoginCnf", "Student Added");
		request.getRequestDispatcher("StudentRegister.jsp").forward(request, response);
		}
		else if(s1.equalsIgnoreCase("Already Present")){
			request.setAttribute("LoginCnf", "Email ID is already exsist.");
			request.getRequestDispatcher("StudentRegister.jsp").forward(request, response);	
		}
		else {
			request.setAttribute("LoginCnf", "There is some error. Kindly check your data.");
			request.getRequestDispatcher("StudentRegister.jsp").forward(request, response);
		}
	         
		   
		
		
		
	}

	

}
