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
    	 //如果密碼跟帳號與default相同
    	 if (account.equals(defaultAccount) && 
    		password.equals(defaultPassword)) {
    		
    		 msg = "登入成功!";
    	 }else {
    		 msg = "登入失敗!";
    	 }
    	 //getRequestDispatcher 的 forward 跳轉 Servlet
		 //注意RequestDispatcher 需要/
    	 //置入數值於Attribute
    	 req.setAttribute("infoMsg", msg);    	 
		 req.getRequestDispatcher("/infoPage").forward(req, resp);
    	 
    	 //跳傳到另一個頁面 顯示登入成功
    	 //跳傳到另一個頁面 顯示登入失敗
//    	 String account =   req.getParameter("account");
//    	 String password = req.getParameter("password");
    	 
    	 	
    }
}
