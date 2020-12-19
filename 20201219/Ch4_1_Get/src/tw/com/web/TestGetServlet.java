package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testget")
public class TestGetServlet extends HttpServlet {
	private String htmlTemplate = "<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<meta charset=\"UTF-8\">\r\n" + 
			"<title>TestGet</title>\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"%s" + 
			"</body>\r\n" + 
			"</html>";
	//單元目標
	//利用Get協定接收前端傳送的資料
	//預設情況瀏覽器都使用Get
	//如果再網址列看到?xxxx=xxx一定是Get
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//接收一個 參數名為number
		//getParameter 回傳的是一個字串
		String number = req.getParameter("number");
		//如果number是null 給予default為0
		number = number == null ?"0":number;
		PrintWriter out  = 	 resp.getWriter();
		//out.print("number:"+number);	
		
		int count = Integer.parseInt(number);
		String h2Tmep = "<h2>%d</h2>";
		//字串串接
		StringBuilder sb = new StringBuilder();
		for (int i =1; i<= count; i++) {			
			String h2Str = String.format(h2Tmep, i);
			sb.append(h2Str);
		}
	  String html = 
			  String.format(htmlTemplate, sb.toString());
	  out.print(html);
		
	}
			
}
