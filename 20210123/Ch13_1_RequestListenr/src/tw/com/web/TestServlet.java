package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
	
	//ServletRequestListener
	//ServletRequestAttributeListener
	//HttpSessionListener
	//HttpSessionAttributeListener	
	//ServletContextListener
	//ServletContextAttributeListener 
	
		@Override
		protected void doGet(HttpServletRequest req, 
				HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String  msg = (String)req.getAttribute("msg");
			System.out.println(msg);
			
		}
}
