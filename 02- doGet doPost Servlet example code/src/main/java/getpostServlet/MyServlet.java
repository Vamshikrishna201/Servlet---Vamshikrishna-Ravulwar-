package getpostServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	/*
	  The 'service()' method is inherited from "HttpServlet",
	  	which implements the "Servlet" interface.
	  	
	  	- service() comes from the Servlet interface
		- It is implemented in HttpServlet
		- You CAN override it, but you usually should not
		
		"service()" receives all HTTP requests.
		It checks the HTTP method (GET, POST, etc.) and calls the matching "doX()" method.
		You override doGet(), doPost(), etc., 
		not usually service(), unless you have a special reason.
	 */	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		PrintWriter out = resp.getWriter();
		out.print("HELLO " + name + " Welcome to HOME page (doget)");
	}
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("name");
//		PrintWriter out = resp.getWriter();
//		out.print("HI " + name + " Welcome to HOME page (dopost)");
//	}

}
