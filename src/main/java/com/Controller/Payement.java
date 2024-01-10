package com.Controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Model.Model1;

@WebServlet("/money")
public class Payement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double cardnum = Double.parseDouble(request.getParameter("cardnum"));
		 Integer day = Integer.parseInt(request.getParameter("day"));
		String mas = request.getParameter("mas");
		
		Integer sal = Integer.parseInt(request.getParameter("sal"));
		
		 
         Integer cvv = Integer.parseInt(request.getParameter("cvv"));
         String cardholdername=request.getParameter("cardholder");
         String city=request.getParameter("city");
         
         Model1 obj2 = new Model1();
         
         obj2.setCardnum(cardnum);
         obj2.setDay(day);
         obj2.setMas(mas);
         obj2.setSal(sal);
         obj2.setCvv(cvv);
         obj2.setCardholder(cardholdername);
         obj2.setCity(city);
         
        
         int rowsAffected=obj2.insert();
         if(rowsAffected==1)
         {
        	 RequestDispatcher rd =request.getRequestDispatcher("PaymentSuccess.jsp");
     		rd.include(request, response);
         //	response.sendRedirect("/MVC_First_Project/Congo.jsp");
         }
         else
         {
         RequestDispatcher rd =request.getRequestDispatcher("PaymentFailure.jsp");
      	rd.include(request, response);
         // response.sendRedirect("/MVC_First_Project/Wrong.jsp");
         }
	}

	

}
