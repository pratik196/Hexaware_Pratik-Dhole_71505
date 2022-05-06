package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
public class Demo5 {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("delete from emp where id =? ");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter ID : ");
			int id=sc.nextInt();
		
			stmt.setInt(1, id );
			
			System.out.print("DO you really want to delete ? yes / no  : ");
			String ch=sc.next ();	
			if(ch.equalsIgnoreCase("yes"))
			{
				stmt.execute();
				System.out.println("Data Deleted   ....! ");
			}
			else
			{
				System.out.println("Data not Deleted ...! ");
			}
		
		
			
			stmt.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}