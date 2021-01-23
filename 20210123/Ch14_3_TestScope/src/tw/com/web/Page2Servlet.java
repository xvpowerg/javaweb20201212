package tw.com.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.scope.TestRequestScore;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	@Inject
	TestRequestScore reqScope;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//Request ©Ò¦³ªºAttributeName
			
			 	Enumeration<String> names = req.getAttributeNames();
			 	while(names.hasMoreElements()) {			 		
			 		System.out.println(req.getAttribute(names.nextElement()));
			 	}
			System.out.println("page2:"+reqScope.hashCode());
			System.out.println(reqScope);
		}
}
