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
	//�@��ӻ�Get�̦h�u���255�r��(1024byte)	
	//�����
	//�@�뱡�p�U �u�O�@�Ӳճs�� �|�ϥ�Get
	//�i�[��ڪ��̷R
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   PrintWriter out = resp.getWriter();
	    String acc =  req.getParameter("account");
	    String pass = req.getParameter("password");
	   out.println("doGet!!!"+acc+":"+pass);
	}
	//�@��ӻ� Post �S����
	//����C
	//�W���ɮ� �n�J ���� 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  PrintWriter out = resp.getWriter();
		  String acc = req.getParameter("account");
		 String pss =  req.getParameter("password");	
		  			   
		  out.println("doPost!!!"+acc+":"+pss);
	}
}
