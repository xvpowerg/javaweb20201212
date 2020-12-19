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
//使用物件他必須new	
	//建立Servlet 步驟
	//1 一定要有一個類別 並且繼承HttpServlet
	//2 可以使用以下兩種方式定義 動作名稱 可任選一種 或 都使用
	// a 使用註記方式
	// b 定義web.xml
	// 放置於WEB-INF

	//HttpServletRequest 輸入的概念
	// 接收客戶端的資料
	//HttpServletResponse 輸出的概念
	// 回傳資料給客戶端
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException {
		//不能呼叫super.doGet 會拋出405的錯誤
		//super.doGet(req, resp);
	PrintWriter out =   resp.getWriter();
	out.print("ABCDE");
	out.println("F");	
	out.println("G");
	out.println("H");
	}
	
	
}
