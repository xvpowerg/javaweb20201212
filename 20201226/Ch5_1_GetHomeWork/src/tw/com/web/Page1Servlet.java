package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//getParameter 取出來的都是字串		
		String numberStr = req.getParameter("number");
		numberStr = numberStr == null ? "0":numberStr;
				
		String valueStr = req.getParameter("value");
		PrintWriter out = resp.getWriter();
		int number = Integer.parseInt(numberStr);
		for (int i = 1 ; i <= number ;i++) {
			out.println(valueStr);
		}
		
		
	}
		
	
}
