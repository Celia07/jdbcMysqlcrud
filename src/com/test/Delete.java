package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con= DriverManager.getConnection("jdbc:mysql://@localhost:3306/new_connexion", "root", "Helloworld@23");
				Statement st= con.createStatement();){
			
			String query =  "DELETE FROM EMP WHERE EMP_ID=2";
			
			int count = st.executeUpdate(query);
			
			if(count==0) {
				System.out.print("Record Not Deleted");
			}else {
				System.out.print("Record Deleted");
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
