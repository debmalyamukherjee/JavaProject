package com.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

public class Model {
	
	   private String name;
	   private String password;
	   private String course;
	   private String country;
	   
	   Connection	connect = null;
	   ResultSet rs =null;
	 //  ResultSet row=null;
	   PreparedStatement pstmnt = null;
	   int rows;
	   int row;
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	   

	public int insert() {
		try {
			Connection	connect = ConnectionPage.getDbConnection();
			String sql = "INSERT INTO courses (name, password,course, country) VALUES(?,?,?,?) ";
		    pstmnt = connect.prepareStatement(sql);
			pstmnt.setString(1, name);
			pstmnt.setString(2, password);
			pstmnt.setString(3, course);
			pstmnt.setString(4, country);
			rows = pstmnt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionPage.closeResource(rs, pstmnt, connect);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	public int edit() {
		try {
			Connection	connect = ConnectionPage.getDbConnection();
			String sql = "update courses set password=?,course=?,country=? where name=?  ";
		    pstmnt = connect.prepareStatement(sql);
			
			pstmnt.setString(1, password);
			pstmnt.setString(2, course);
			pstmnt.setString(3, country);
			pstmnt.setString(4, name);
			int rowss = pstmnt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionPage.closeResource(rs, pstmnt, connect);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	
	public int delete() {
		try {
			Connection	connect = ConnectionPage.getDbConnection();
			String sql = "delete from courses  where name=?  ";
		    pstmnt = connect.prepareStatement(sql);
			
			pstmnt.setString(1, name);
			pstmnt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ConnectionPage.closeResource(rs, pstmnt, connect);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
		return rows;
	}
	

//	public int  verify()
//	   {
//		try {
//			Connection	connect = ConnectionPage.getDbConnection();
//			String sql="SELECT name , password from courses where name=? and password=?";
//			PreparedStatement pstmnt = connect.prepareStatement(sql);
//			pstmnt.setString(1, name);
//			pstmnt.setString(2, password);
//		ResultSet	rs = pstmnt.executeQuery(); 
//		if(rs.next()) {
//		}
//	} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				ConnectionPage.closeResource(rs, pstmnt, connect);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return rows;
//	   }
	
	public int select() {
		try {
			Connection connect = ConnectionPage.getDbConnection();
	         String sql = "select name,course,country from courses";
	         PreparedStatement pstmnt = connect.prepareStatement(sql);
	          pstmnt.executeQuery(); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

}