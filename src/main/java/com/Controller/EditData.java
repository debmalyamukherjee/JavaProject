package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.ConnectionPage;
import com.Model.Model;

@WebServlet("/edit")
public class EditData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String name = request.getParameter("name");
		 String password=request.getParameter("password");
         String course=request.getParameter("course");
         String country=request.getParameter("country");
        
         Model obj = new Model();
         obj.setName(name);
         obj.setPassword(password);
         obj.setCourse(course);
         obj.setCountry(country);
         
         int rowUpdated = obj.edit();
         
         PrintWriter pw = response.getWriter();
         pw.print("<html><body>");
         
         if(rowUpdated != 1) {
        	 pw.print("<h1>Done</h1>");       
        	 }
         else {
        	 pw.print("<h1>Fail</h1>");       
         }
    	 pw.print("</body></html>"); 
}

	
}
