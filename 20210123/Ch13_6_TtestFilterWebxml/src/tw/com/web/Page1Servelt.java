package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view/page1")
public class Page1Servelt extends HttpServlet{
	//�ϥ�web.xml�]�w��Filter �|�̷�filter-mapping�ŧi���� �I�s
	//chain.doFilter ���F�v�T�I�s�����~ �]�|�v�TFilter���I�s
			@Override
			protected void doGet(HttpServletRequest req,
					HttpServletResponse resp) throws ServletException, IOException {
				// TODO Auto-generated method stub
						resp.getWriter().println("Page1");
						req.setAttribute("msg", "Page1Servelt");
			}
}
