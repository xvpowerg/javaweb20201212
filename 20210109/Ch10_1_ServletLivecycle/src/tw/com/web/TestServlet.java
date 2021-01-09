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
	
//Servlet什麼時候運行
//一般情況下 是當第一位使用者 進入Servlet 會將Servlet new 
//之後其他的使用者都是透過執行序運行
//如果使用Servlet的屬性作為 資料儲存 會有覆蓋的問題
//因該將所有資料儲存 的變數宣告為區域變數

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		System.out.println("hashCode:"+this.hashCode());
		System.out.println(Thread.currentThread().getName());

		
	}
	

	
	
}

