package tw.com.web;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet{
	//¤k¥Í­¶­±
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Optional<Object> htmlOptional =
				Optional.ofNullable(
				req.getAttribute("html"));
		 htmlOptional.ifPresent(obj->{
			String html =  obj.toString();
			try {
				resp.getWriter().print(html);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			 
		 });
		
	}
}
