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

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection connect = ConnectionPage.getDbConnection();
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String sql = "SELECT name,password from courses where name=? and password=?";
			PreparedStatement pstmnt = connect.prepareStatement(sql);
			pstmnt.setString(1, name);
			pstmnt.setString(2, password);
			ResultSet rs = pstmnt.executeQuery();
			if (rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.jsp");
				rd.include(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("loginfail.jsp");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
