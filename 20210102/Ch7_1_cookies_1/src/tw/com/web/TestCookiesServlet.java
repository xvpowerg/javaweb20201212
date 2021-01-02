package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testcookies")
public class TestCookiesServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookieArray  =  req.getCookies();
		System.out.println("is Null:"+(cookieArray == null));
		if (cookieArray != null) {
			System.out.println("length:"+cookieArray.length);
			for (Cookie cook : cookieArray) {
				System.out.println("cook:"+cook.getName()+":"+cook.getValue());
			}
		}
		
		
	}
}
