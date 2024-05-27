package com.SchoolWebsite.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.SchoolWebsite.Beans.StudentRegisterBean;
import com.SchoolWebsite.Model.StudentDB;


/**
 * Servlet implementation class ViewAllStudents
 */
public class ViewAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllStudents() {
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
		//StudentRegisterBean sb= new StudentRegisterBean();
		List<StudentRegisterBean> students = sd.viewAllStudents();

        // Pass the list of students to your JSP
        request.setAttribute("students", students);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AllStdDetails.jsp");
        dispatcher.forward(request, response);
    
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
