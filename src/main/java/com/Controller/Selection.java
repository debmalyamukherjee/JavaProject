package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.ConnectionPage;
import com.Model.Model;

@WebServlet("/FetchData")
public class Selection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		 String name=request.getParameter("name");
//         String course=request.getParameter("course");
//         String country=request.getParameter("country");
//         
//         Model obj1 = new Model();
//         obj1.setName(name);
//         obj1.setCourse(course);
//         obj1.setCountry(country);
//         obj1.select();
         
         
		try {
			response.setContentType("text/html");
			Connection connect = ConnectionPage.getDbConnection();
		
	         String sql = "select name,course,country from courses";
	         PreparedStatement pstmnt = connect.prepareStatement(sql);
				ResultSet rs = pstmnt.executeQuery();
				PrintWriter out = response.getWriter();
				
				out.println("<html><head>\r\n"
						+ "<style>\r\n"
						+ "ul {\r\n"
						+ "  list-style-type: none;\r\n"
						+ "  margin: 0;\r\n"
						+ "  padding: 0;\r\n"
						+ "  overflow: hidden;\r\n"
						+ "  background-color: #dddddd;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "li {\r\n"
						+ "  float: left;\r\n"
						+ "}\r\n"
						+ "\r\n"
						+ "li a {\r\n"
						+ "  display: block;\r\n"
						+ "  padding: 8px;\r\n"
						+ "}\r\n"
						+ "</style>\r\n"
						+ "</head>\r\n"
						+ "<header>\r\n"
						+ "\r\n"
						+ "  <ul>\r\n"
						+ "  <li><a href=\"https://telusko.com/\"> Telusko</a></li>\r\n"
						+ "  <li><a href=\"Edit.jsp\" >Edit</a></li>\r\n"
						+ "  <li><a href=\"Delete.jsp\" >Delete</a></li>\r\n"
						+ "   <li><a href=\"Logout.jsp\" >Logout</a></li>\r\n"
						+ "  </ul>\r\n"
						+ " \r\n"
						+ "</header>\r\n"
						+ "<body>\r\n"
						+ "\r\n"
						+ "</body></html>");
				out.println("<html><body><table width=50% border=2 align=center><tr><td>Name:</td><td>Course:</td><td>Country:</td></tr>");
			//	out.print("<jsp:include page=./header2.jsp></jsp:include>");
				out.print ("<text align=center><caption>Candidate Details:</caption></text>");
				 out.print ("</br></br>");
				while(rs.next()) {
					out.println("<tr><td>"+ rs.getString(1)+"</td><td>"+ rs.getString(2)+"</td><td>"+ rs.getString(3)+"</td></tr>");
				}
				
				out.println("</table></body></html>");
				
				RequestDispatcher rd = request.getRequestDispatcher("Viewdata.jsp");
				rd.include(request, response);
				 
	         
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
