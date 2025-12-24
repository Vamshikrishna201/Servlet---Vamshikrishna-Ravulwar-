package com.project;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String x = req.getParameter("x");
		String y = req.getParameter("y");
		
		int x1 = Integer.parseInt(x);
		int y1 = Integer.parseInt(y);
		
		int sum = x1 + y1;
//		PrintWriter out=resp.getWriter();
//		out.println("Sum = "+sum);
		
		req.setAttribute("mysum", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("CallingServlet2");
//		rd.include(req, resp);
		rd.forward(req, resp);
		
	}

}
