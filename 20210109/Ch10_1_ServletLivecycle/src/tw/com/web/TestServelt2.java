package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/testServelt2")
public class TestServelt2 extends HttpServlet {
	//init(ServletConfig config) ��ƬOServlet�Ĥ@�Ӫ�l�Ʊ���
	  //ServletConfig �]�t�@��Servlet���]�w��
	  //�|�b����Ƥ��I�sinit(); �]�����Ʊ�}�o�H���мginit(ServletConfig config) �ҥH���@��init()
	  //�ɶq���n�мginit(ServletConfig config)
	@Override
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub	
			super.init(config);
			System.out.println("init ServletConfig");
		}
	//�u���n��l�Ʀ]���мginit()
	@Override
	public void init() throws ServletException {
			// TODO Auto-generated method stub
			System.out.println("init()");
		}
//�|�bservice���I�s�ǤJHttpServletRequest�PHttpServletResponse��service
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
		System.out.println("service ServletRequest ServletResponse!!");
	}
	//HttpServle��service�I�sdoGet�PdoPost	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);//�I�sdoGet doPost .....
		System.out.println("service HttpServletRequest HttpServletResponse!!");
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("testServelt2 doGet!!");		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("TestServelt2 destroy!!");		
	}
	
}
