package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.tools.Md5;
import tw.com.web.tools.RequestTools;


@WebServlet("/loginPage")
public class LoginPageServlet  extends HttpServlet{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	// String defaultAccount = "qwer";
    	 String defaultAccount = "962012d09b8170d912f0669f6d7d9d07";
    	String defaultPassword = "12345"; 
    	 
    	
    
    	 String account =  RequestTools.getParamater(req, "account", "");
    	 String password = RequestTools.getParamater(req, "password", "");
    	 account  = Md5.getMD5(account);
    	 resp.setContentType("text/html;charset=UTF-8");
    	 PrintWriter out = resp.getWriter();
    	 out.println(account+":"+password);
    	System.out.println("Md5:"+defaultAccount+":"+account);
    	 String msg = "";
    	 //�p�G�K�X��b���Pdefault�ۦP
    	 if (account.equals(defaultAccount) && 
    		password.equals(defaultPassword)) {
    		
    		 msg = "�n�J���\!";
    	 }else {
    		 msg = "�n�J����!";
    	 }
    	 //getRequestDispatcher �� forward ���� Servlet
		 //�`�NRequestDispatcher �ݭn/
    	 //�m�J�ƭȩ�Attribute
    	 req.setAttribute("infoMsg", msg);    	 
		 req.getRequestDispatcher("/infoPage").forward(req, resp);
    	 
    	 //���Ǩ�t�@�ӭ��� ��ܵn�J���\
    	 //���Ǩ�t�@�ӭ��� ��ܵn�J����
//    	 String account =   req.getParameter("account");
//    	 String password = req.getParameter("password");
    	 
    	 	
    }
}
