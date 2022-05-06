package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Demo3 {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("update emp set palce= ? where id =? ");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter ID : ");
			int id=sc.nextInt();
			
			
			System.out.print("ENter Palce ");
			String place=sc.next();
			
			stmt.setString(1,place  );
			stmt.setInt(2, id );
			
			stmt.execute();
			stmt.close();
			System.out.println("Data Updated  ....! ");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}