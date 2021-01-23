package tw.com.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.scope.TestApplicationScore;
import tw.com.scope.TestRequestScore;
import tw.com.scope.TestSessionScore;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Inject
		TestRequestScore reqScope;
		@Inject
		TestSessionScore sessionScope;
		@Inject
		TestApplicationScore appScore;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
			reqScope.setName("Howard!!");
			sessionScope.setName("Session Joy");
			appScore.setName("Appliaction Nana");
			System.out.println("page1:"+reqScope.hashCode());
			req.setAttribute("value","Iris");
			req.getRequestDispatcher("/page2").
			forward(req, resp);
			
		
		}
}
