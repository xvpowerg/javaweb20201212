package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/infoPage")
public class InfoPageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		action(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		action(req,resp);
	}
	
	private void action(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
			
		PrintWriter out =  resp.getWriter();
		String msgStr = Optional.ofNullable(req.getAttribute("infoMsg")).
		map(msg->msg.toString()).orElse("µL°T®§");
		out.println(msgStr);
	
	}
}
