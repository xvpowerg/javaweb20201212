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
@WebServlet("/page1")
public class PageServlet1 extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = 	resp.getWriter();
		// 有一份資料 要分享給網站上所有的人使用可以使用 ServletContext	
		ServletContext application =   getServletContext();		
		Integer obj = (Integer)application.getAttribute("count");
		Optional<Integer> intOptional = Optional.ofNullable(obj);
		int count =  intOptional.orElse(0);
		out.println("Page1");		
		count++;
		application.setAttribute("count", count);
				
		}
}
