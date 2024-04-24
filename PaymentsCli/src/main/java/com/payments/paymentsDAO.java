package com.payments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class paymentsDAO {
	
	public void insert(user u)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/paymentscli","root","G2002@uruv#");
				 Statement stmt = con.createStatement();
				String query = "insert into user_info(phone_number,email,first_name,last_name,Date_of_birth,user_password)values('"+u.getPhoneNumber()+"','"+u.getEmail()+"','"+u.getFirstName()+"','"+u.getLastName()+"','"+u.getDateofBirth()+"','"+u.getPassword()+"')";
				System.out.println(query);
				stmt.executeUpdate(query);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	public boolean validlogin(String phonenumber,String password)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/paymentscli","root","G2002@uruv#");
				 Statement stmt = con.createStatement();
				String query = "select phone_number,user_password from user_info";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					if(rs.getString("phone_number").equals(phonenumber)&& rs.getString("user_password").equals(password))
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
