package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.stream.Collectors;
import java.util.stream.Stream;
@WebServlet("/page1")
public class Page1Servelt extends HttpServlet {
	private String tmplate = "<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<meta charset=\"UTF-8\">\r\n" + 
			"<title>�����Ȧ�</title>\r\n" + 
			"<style>\r\n" + 
			"    body{\r\n" + 
			"        background-color:%s;\r\n" + 			
			"    }\r\n" + 
			"</style>\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"	<h2>%s</h2>\r\n" + 
			"	<ol>%s" +  
			"	</ol>\r\n" + 
			"</li>\r\n" + 
			"</body>\r\n" + 
			"</html>";
	
	private Map<String,String> foodMap; 
	
	//init ��ڪ�Servelt�Ĥ@���I�s�ɷ|�I�s
	public void init() throws ServletException {
		String[] foodData = {"1:�J�|","2:����","3:�ޱ�","4:�N�n","5:Pizza"};
		Stream<String> foodStream = Stream.of(foodData);
		foodMap = foodStream.collect(Collectors.
				toMap(str->str.split(":")[0],
				      str->str.split(":")[1]));
		System.out.println(foodMap);
	}
	//�k�ͭ���
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//�i��ܤ���
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter out =  resp.getWriter();
			//��� �k��
			//�Ŀ�F���ǭ���
			 String sex = req.getParameter("sex");
			 String[] foods =  req.getParameterValues("food");
			 String foodList = "";
			 if (foods != null) {
				Stream<String> str = Stream.of(foods);
				 foodList = str.map(key->"<li>"+foodMap.get(key)+"</li>").
				 collect(Collectors.joining(""));
			 }
			 String sexStr = "�k��";
			 String styleStr = "steelblue";
			 
			 if (sex.trim().equals("2")) {
				 sexStr = "�k��";
				 styleStr = "pink";				 
			 }
			 String html = String.format(tmplate,
					 styleStr,sexStr,foodList);	
			
			 if (sex.trim().equals("2")) {
				 req.setAttribute("html", html);
				 req.getRequestDispatcher("/page2").
				 forward(req, resp);
			 }
			 out.print(html);	
		
			 
			//�p�G�O�k��  ���Page2Servelt
			//��� �k��
			//�Ŀ�F���ǭ���
			
		}
}
