//read

package com;

import java.sql.*;

public class Demo6 {

	public static void main(String[] args) {

		
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
	
			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " : "+rs.getString(2)+ " : "+rs.getString(3)+ " : "+rs.getInt(4));
			}
			stmt.close();

		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}