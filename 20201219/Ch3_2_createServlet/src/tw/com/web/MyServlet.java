package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class MyServlet extends HttpServlet {
//�ϥΪ���L����new	
	//�إ�Servlet �B�J
	//1 �@�w�n���@�����O �åB�~��HttpServlet
	//2 �i�H�ϥΥH�U��ؤ覡�w�q �ʧ@�W�� �i����@�� �� ���ϥ�
	// a �ϥε��O�覡
	// b �w�qweb.xml
	// ��m��WEB-INF

	//HttpServletRequest ��J������
	// �����Ȥ�ݪ����
	//HttpServletResponse ��X������
	// �^�Ǹ�Ƶ��Ȥ��
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		//����I�ssuper.doGet �|�ߥX405�����~
		//super.doGet(req, resp);
	PrintWriter out =   resp.getWriter();
	out.print("ABCDE");
	out.println("F");	
	out.println("G");
	out.println("H");
	}
	
	
}
