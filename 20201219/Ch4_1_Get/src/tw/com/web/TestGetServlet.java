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
	//�椸�ؼ�
	//�Q��Get��w�����e�ݶǰe�����
	//�w�]���p�s�������ϥ�Get
	//�p�G�A���}�C�ݨ�?xxxx=xxx�@�w�OGet
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//�����@�� �ѼƦW��number
		//getParameter �^�Ǫ��O�@�Ӧr��
		String number = req.getParameter("number");
		//�p�Gnumber�Onull ����default��0
		number = number == null ?"0":number;
		PrintWriter out  = 	 resp.getWriter();
		//out.print("number:"+number);	
		
		int count = Integer.parseInt(number);
		String h2Tmep = "<h2>%d</h2>";
		//�r��걵
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
