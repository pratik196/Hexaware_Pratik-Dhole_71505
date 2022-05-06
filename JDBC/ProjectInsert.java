package com;
import java.sql.*;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

public class Demo2 {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("insert into emp values(?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter ID : ");
			int id=sc.nextInt();
			
			System.out.print("ENter Name : ");
			String name=sc.next();
			
			System.out.print("ENter Palce ");
			String place=sc.next();
			
			System.out.print("Enter PIN   : ");
			int pin=sc.nextInt();
			
			
			stmt.setInt(1,id );
			stmt.setString(2, name);
			stmt.setString(3, place );
			stmt.setInt(4, pin);
			
			stmt.execute();
			
			
			
			stmt.close();
			System.out.println("Data Inserted ....! ");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}