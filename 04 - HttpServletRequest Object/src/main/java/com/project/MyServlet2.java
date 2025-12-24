package com.project;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		int pro = x1 * y1;
		
		int sum = (int) req.getAttribute("mysum");
		//this will give in the for of an object
		// thays why we have to do a typecasting (Integer)
		PrintWriter out1 = resp.getWriter();
		out1.println("SUM = "+sum);
		
		PrintWriter out2 = resp.getWriter();
		out2.println("PRODUCT = "+pro);
		
	}

}
