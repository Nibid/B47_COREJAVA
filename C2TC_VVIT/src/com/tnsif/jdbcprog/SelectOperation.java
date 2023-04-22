package com.tnsif.jdbcprog;
import java.sql.*;
import javax.sql.*;
import java.sql.DriverManager;

public class SelectOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//establish connection
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/b47","root","nibid@2058");
			//create statement
			
		Statement st=conn.createStatement();
		//write the query
		String str="select book_id,title,price,quantity from book";
		//execute the query
		ResultSet rst=st.executeQuery(str);
		System.out.println("the records are");
		int rowCount=0;
		while(rst.next());
		int book_id=rst.getInt("book_id");
		String title=rst.getString("title");
		int price=rst.getInt("price");
		int quantity=rst.getInt("quantity");
		System.out.println(book_id+","+title);
		++rowCount;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
