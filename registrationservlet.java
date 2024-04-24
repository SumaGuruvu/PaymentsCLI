package com.payments;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrationservlet
 */
@WebServlet("/registrationservlet")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public registrationservlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String dateofbirth=request.getParameter("dob");
		String password=request.getParameter("password");
		System.out.println("done");
		user u=new user();
		u.setPhoneNumber(phno);
		u.setFirstName(firstname);
		u.setLastName(lastname);
		u.setEmail(email);
		u.setDateofBirth(dateofbirth);
		u.setPassword(password);
		paymentsappDAO pd=new paymentsappDAO();
		pd.insert(u);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}


