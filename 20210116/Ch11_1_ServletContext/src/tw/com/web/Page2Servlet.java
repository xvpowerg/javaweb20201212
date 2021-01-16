package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			
			ServletContext app = getServletContext();
			Integer obj = (Integer)app.getAttribute("count");
			Optional<Integer> inOptional = Optional.ofNullable(obj);
			
			 int count =  inOptional.orElse(0);
			 PrintWriter out =   resp.getWriter();
			 out.println("count:"+count);
			 
		}
}
