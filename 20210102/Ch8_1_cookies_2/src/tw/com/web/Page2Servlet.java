package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.http.MySession;
@WebServlet("/page2")
public class Page2Servlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		MySession mySession = 
				MySession.getMySession(req, resp);
		List<String> objList = 
				(ArrayList) mySession.getAttrbute("value1");
		System.out.println(objList);
	}
}
