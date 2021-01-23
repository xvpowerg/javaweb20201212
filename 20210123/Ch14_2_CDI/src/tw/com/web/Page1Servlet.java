package tw.com.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		static final  String FRUIT = "banana";
		@Inject
		Student st;
		//只有一個類別實做此介面 Inject會動new此類 
		@Inject
		@Named(FRUIT)
		Fruit fruit;
		
		@Inject
		List<String> nameList;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//Contexts and Dependency Injection
			//Injection 某些物件　透過容器維護
			System.out.println(st.hashCode());
			System.out.println(fruit);
			System.out.println(nameList);
		}
}
