package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/page1")
public class Page1Servelt extends HttpServlet {
	//男生頁面
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//顯示 男生
			//勾選了哪些食物
			
			//如果是女生  轉到Page2Servelt
			//顯示 女生
			//勾選了哪些食物
			
		}
}
