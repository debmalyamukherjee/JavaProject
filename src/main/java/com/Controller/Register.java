package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Model;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("name");
         String pw=request.getParameter("password");
         String course=request.getParameter("course");
         String country=request.getParameter("country");
         
         Model obj1 = new Model();
         obj1.setName(name);
         obj1.setPassword(pw);
         obj1.setCourse(course);
         obj1.setCountry(country);
         int rowsAffected=obj1.insert();
         if(rowsAffected==1)
         {
        	 RequestDispatcher rd =request.getRequestDispatcher("Congo.jsp");
     		rd.include(request, response);
         //	response.sendRedirect("/MVC_First_Project/Congo.jsp");
         }
         else
         {
         RequestDispatcher rd =request.getRequestDispatcher("Wrong.jsp");
      	rd.include(request, response);
         // response.sendRedirect("/MVC_First_Project/Wrong.jsp");
         }
	}

	

}
