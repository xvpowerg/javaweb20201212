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
	//init(ServletConfig config) 函數是Servlet第一個初始化條件
	  //ServletConfig 包含一些Servlet的設定值
	  //會在此函數內呼叫init(); 因為不希望開發人員覆寫init(ServletConfig config) 所以有一組init()
	  //盡量不要覆寫init(ServletConfig config)
	@Override
		public void init(ServletConfig config) throws ServletException {
			// TODO Auto-generated method stub	
			super.init(config);
			System.out.println("init ServletConfig");
		}
	//真的要初始化因該覆寫init()
	@Override
	public void init() throws ServletException {
			// TODO Auto-generated method stub
			System.out.println("init()");
		}
//會在service內呼叫傳入HttpServletRequest與HttpServletResponse的service
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
		System.out.println("service ServletRequest ServletResponse!!");
	}
	//HttpServle的service呼叫doGet與doPost	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);//呼叫doGet doPost .....
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
