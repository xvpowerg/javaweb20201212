package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/testGetVsPost")
public class GetVsPostServlet extends HttpServlet {
	//一般來說Get最多只能傳255字元(1024byte)	
	//比較快
	//一般情況下 只是一個組連接 會使用Get
	//可加到我的最愛
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   PrintWriter out = resp.getWriter();
	    String acc =  req.getParameter("account");
	    String pass = req.getParameter("password");
	   out.println("doGet!!!"+acc+":"+pass);
	}
	//一般來說 Post 沒限制
	//比較慢
	//上傳檔案 登入 等等 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  PrintWriter out = resp.getWriter();
		  String acc = req.getParameter("account");
		 String pss =  req.getParameter("password");	
		  			   
		  out.println("doPost!!!"+acc+":"+pss);
	}
}
