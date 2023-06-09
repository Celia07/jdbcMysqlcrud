package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con= DriverManager.getConnection("jdbc:mysql://@localhost:3306/new_connexion", "root", "Helloworld@23");
				Statement st= con.createStatement();){
			
		String query =  "UPDATE EMP SET EMP_NAME='OMANIA' WHERE EMP_ID=100 ";
			
			int count = st.executeUpdate(query);
			
			if(count==0) {
				System.out.print("Record Not UPDATED");
			}else {
				System.out.print("Record UPDATED");
			}
			
		}catch(SQLException se) {
			System.out.println(se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
