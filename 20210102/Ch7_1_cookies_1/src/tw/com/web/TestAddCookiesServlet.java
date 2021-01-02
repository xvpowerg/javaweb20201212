package tw.com.web;
import java.io.IOException;
import java.time.LocalTime;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addCookies")
public class TestAddCookiesServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("cookName", 
					LocalTime.now().toString());	
		Cookie cookie2 = new Cookie("cookName2", 
				LocalDateTime.now().toString());	
	      resp.addCookie(cookie);
	      resp.addCookie(cookie2);
	      resp.getWriter().println("Add Cookies!!");
	}
}
