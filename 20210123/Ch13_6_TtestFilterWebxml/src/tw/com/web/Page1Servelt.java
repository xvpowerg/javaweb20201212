package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view/page1")
public class Page1Servelt extends HttpServlet{
	//使用web.xml設定的Filter 會依照filter-mapping宣告順序 呼叫
	//chain.doFilter 除了影響呼叫頁面外 也會影響Filter的呼叫
			@Override
			protected void doGet(HttpServletRequest req,
					HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
						resp.getWriter().println("Page1");
						req.setAttribute("msg", "Page1Servelt");
			}
}
