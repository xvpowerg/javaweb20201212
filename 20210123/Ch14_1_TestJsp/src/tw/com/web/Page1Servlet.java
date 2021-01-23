package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
			@Override
			protected void doGet(HttpServletRequest req,
					HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
				req.setAttribute("req_msg", "request Msg");
				HttpSession session = req.getSession();
				session.setAttribute("sess_msg", "Session msg");
				getServletContext().setAttribute("app_msg", "App msg");
				
				
				req.getRequestDispatcher("show.jsp").forward(req, resp);
			}
}
