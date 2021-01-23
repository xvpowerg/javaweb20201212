package tw.com.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.scope.TestApplicationScore;
import tw.com.scope.TestRequestScore;
import tw.com.scope.TestSessionScore;

@WebServlet("/page3")
public class Page3Servlet extends HttpServlet {
	@Inject
	TestSessionScore sessionScope;
	@Inject
	TestApplicationScore appScope;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub		
			//System.out.println("page3:"+sessionScope.hashCode());
			System.out.println(sessionScope);
			System.out.println(appScope);
		}
}
