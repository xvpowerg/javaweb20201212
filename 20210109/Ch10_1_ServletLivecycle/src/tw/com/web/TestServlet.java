package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Random;
@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
	
//Servlet����ɭԹB��
//�@�뱡�p�U �O��Ĥ@��ϥΪ� �i�JServlet �|�NServlet new 
//�����L���ϥΪ̳��O�z�L����ǹB��
//�p�G�ϥ�Servlet���ݩʧ@�� ����x�s �|���л\�����D
//�]�ӱN�Ҧ�����x�s ���ܼƫŧi���ϰ��ܼ�

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		System.out.println("hashCode:"+this.hashCode());
		System.out.println(Thread.currentThread().getName());

		
	}
	

	
	
}

