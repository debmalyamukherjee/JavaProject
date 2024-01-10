package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Model;


@WebServlet("/delete")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String name = request.getParameter("name");
		 Model obj3 = new Model();
		 obj3.setName(name);
		 int isDelete = obj3.delete();
		 PrintWriter pw = response.getWriter();
         pw.print("<html><body>");
         
         if(isDelete != 1) {
        	 pw.print("<h1>Done</h1>");       
        	 }
         else {
        	 pw.print("<h1>Fail</h1>");       
         }
    	 pw.print("</body></html>"); 
		
	
	}
}
