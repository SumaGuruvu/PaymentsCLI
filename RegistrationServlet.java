
package com.payments;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String phno=request.getParameter("phno");
		String email=request.getParameter("email");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String dateofbirth=request.getParameter("dob");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		
		users u=new users();
		u.setPhoneNo(Long.parseLong(phno));
		u.setEmail(email);
		u.setFirstName(firstname);
		u.setLastName(lastname);
		u.setCurrbal(0.0d);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
		Date dob;
		try {
				dob=format.parse(dateofbirth);
				u.setDateOfBirth(dob);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		u.setPassword(password);
		u.setAddress(address);
		
		PaymentsDAO pd=new PaymentsDAO();
		pd.insert(u);
		response.setContentType("text/html");
		RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}