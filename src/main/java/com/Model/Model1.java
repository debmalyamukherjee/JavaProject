package com.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Model1 {

	private Double cardnum;
	private int day;
	private String mas;
	private int sal;
	private int cvv;
	private String cardholder;
	private String city;

	Connection connect = null;
	ResultSet rs = null;
	// ResultSet row=null;
	PreparedStatement pstmnt = null;
	int rows;
	int row;

	public Double getCardnum() {
		return cardnum;
	}

	public void setCardnum(Double cardnum) {
		this.cardnum = cardnum;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMas() {
		return mas;
	}

	public void setMas(String mas) {
		this.mas = mas;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getCardholder() {
		return cardholder;
	}

	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int insert() {
		try {
			//// Date date = new Date();
			// java.sql.Date sqlDate = new java.sql.Date(date.getDate());

			Connection connection = ConnectionPage.getDbConnection();
			String data = "INSERT INTO payment (cardnum,day,mas,sal,cvv,cardholder,city) VALUES(?,?,?,?,?,?,?) ";
			pstmnt = connection.prepareStatement(data);

			pstmnt.setDouble(1, cardnum);
			pstmnt.setInt(2, day);
			pstmnt.setString(3, mas);
			pstmnt.setInt(4, sal);
			pstmnt.setInt(5, cvv);
			pstmnt.setString(6, cardholder);
			pstmnt.setString(7, city);

			rows = pstmnt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionPage.closeResource(rs, pstmnt, connect);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

}
