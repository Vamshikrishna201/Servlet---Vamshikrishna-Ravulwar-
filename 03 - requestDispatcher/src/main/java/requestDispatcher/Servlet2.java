package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String naam = req.getParameter("name");
		PrintWriter out = resp.getWriter();
		out.println("Hello " + naam + " Welcome to home page (Servlet2)");
	}
  // this is known as servlet chaining
}
