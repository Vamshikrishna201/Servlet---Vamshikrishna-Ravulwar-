package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String name = req.getParameter("name");
		PrintWriter out = resp.getWriter();
		out.println("Hey " + name + ", Welcome to Home page (Servlet1)");
		
		RequestDispatcher rd = req.getRequestDispatcher("/second");
		rd.include(req, resp);
		//whenever your forwarding what even your printing from servlet1
		//it will get ignored by your server it self
		
		// but i want this message also now, so what i can do!
		// so one word we can change and we will get bother servlet1 and 2 message
		// but what is that
		// when u use forward method the output is displaying it will be ignored
		// but i want the output of him also and servlet2 also
		// the u shoud not tell forword, so what to say 
		// u have to say include, 
		// when u tell include, your tell this output also and servlet2 also
		
	}
}
