package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		/*
		 CREATE TABLE users (
		  id serial primary key,
		  first_name varchar(50),
		  last_name varchar(50),
		 email varchar(50)
		 ); 
		 */
		// pest the postgres DRIVER jar globaly in tomCat lib
		String url = "jdbc:postgresql://localhost:5432/members";
		String user = "postgres";
		String pass = "admin";
		
		String sql = "INSERT INTO users (first_name, last_name, email) VALUES(?, ?, ?)";
		
		PreparedStatement pstmt;
		
		PrintWriter out;
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Success" + con);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, req.getParameter("name"));
			pstmt.setString(2, req.getParameter("lastname"));
			pstmt.setString(3, req.getParameter("email"));
			
			int n = pstmt.executeUpdate();
			//this will check the execution updated in row or not
			
			out = resp.getWriter();// remember a pen
			if(n > 0) {
				System.out.println(n+ " row inserted");
				out.println("Registration Successful");
			}
			else {
				out.print("Registration Fail");
			}
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
