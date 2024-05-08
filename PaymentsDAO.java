package com.payments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
public class PaymentsDAO {
	
	public boolean insert(users u)
	{
		
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/softbound","root","root");
				 Statement stmt = con.createStatement();
				 SimpleDateFormat sf=new SimpleDateFormat("yyyy-mm-dd");
				String query = "insert into users(phone_number,email,first_name,last_name,date_of_birth,password,address,current_balance)values('"+u.getPhoneNo()+"','"+u.getEmail()+"','"+u.getFirstName()+"','"+u.getLastName()+"','"+sf.format(u.getDateOfBirth())+"','"+u.getPassword()+"','"+u.getAddress()+"','"+u.getCurrbal()+"')";
				System.out.println(query);
				stmt.executeUpdate(query);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return false;
	}
	public boolean validlogin(String phonenumber,String password)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/paymentscli","root","root");
				 Statement stmt = con.createStatement();
				String query = "select phone_number,user_password from users";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					if(rs.getString("phone_number").equals(phonenumber)&& rs.getString("password").equals(password))
					{
						return true;
					}
					
				}
				System.out.println(query);
				
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		    return false;
	}

}