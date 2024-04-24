package com.payments;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public login() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phonenumber=request.getParameter("phno");
		String password=request.getParameter("password");
		paymentsappDAO pd=new paymentsappDAO();
		if(pd.validlogin(phonenumber, password))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.html");
			rd.forward(request, response);
		}
		else
		{
			response.getWriter().write("invalid");
			RequestDispatcher rd=request.getRequestDispatcher("/Dashboard.html");
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
