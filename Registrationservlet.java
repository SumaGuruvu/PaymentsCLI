package com.payments;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Registrationservlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String dateofbirth=request.getParameter("dateofbirth");
		String password=request.getParameter("password");
		System.out.println("done");
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/Paymentscli","root","G20@uruv#");
			 Statement stmt = con.createStatement();
			String query = "insert into user_info(phone_number,email,first_name,last_name,Date_of_birth,user_password)values('"+phno+"','"+email+"','"+firstname+"','"+lastname+"','"+dateofbirth+"','"+password+"')";
			System.out.println(query);
			stmt.executeUpdate(query);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
