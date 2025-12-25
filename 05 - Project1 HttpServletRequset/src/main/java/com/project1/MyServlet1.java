package com.project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ContentHandler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet1 extends HttpServlet {
	
	static int count = 3;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String un = req.getParameter("username");
		String pw = req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		
		resp.setContentType("text/html");
		/*
		 What is resp.setContentType("text/html")?
		 -> It sets the Content-Type HTTP header in the response.
		 
		 -> This helps the browser or client interpret 
		 	the response correctly 
		 	(e.g., as HTML, JSON, plain text, image, etc.).
		 	
		 -> It should be called before writing any
		  	output to the response (before getWriter()
		  	or getOutputStream()), otherwise it may not
		  	take effect.*/

			if(pw.equals("asond2025")) {
				out.println("Welcom " +un+ " To Home Page!!");
			} 
			else if(count > 0) {
				out.println("Invalid Password, ("+count+") ATTEMPTS LEFT");
				count--;
				RequestDispatcher rd= req.getRequestDispatcher("index.html");
				rd.include(req, resp);
			}
			else {
				out.println("Attempts Over, Contact ADMIN!!");
			}
		
	}

}
