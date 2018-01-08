package com.womanDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class ContactDao
{
	/*
	public boolean check(String name, String email, String message)
	{
		String query="select * from contact where username=? and email=? and message=?";
		String url="jdbc:mysql://localhost:3306/woman";
		String username="root";
		String password="pooniasatvik";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, message);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				
				return true;
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}*/
	
	public void insert(String name, String email, String message)
	{
		
		String url="jdbc:mysql://localhost:3306/woman";
		String username="root";
		String password="pooniasatvik";
		String query="insert into contact values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, message);

			st.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}


