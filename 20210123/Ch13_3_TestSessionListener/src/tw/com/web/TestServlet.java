package tw.com.web;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				HttpSession session = req.getSession();
				session.setAttribute("TTT", "MyUser!!!");
				
				Thread th1 = new Thread(()->{
					try {
						TimeUnit.SECONDS.sleep(3);
						session.invalidate();	
					}catch(Exception ex) {
						
					}
				} ) ;
				th1.start();
				
		}
}
