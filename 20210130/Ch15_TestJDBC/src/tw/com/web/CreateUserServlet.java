package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.beans.MyUser;
import tw.com.dao.DaoFactory;
import tw.com.dao.UserDao;
@WebServlet("/createuser")
public class CreateUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String account = 
				req.getParameter("account");
		String password = 
				req.getParameter("password");
		
		UserDao userDao = DaoFactory.createUserDao();
		MyUser myuser =
				new MyUser(0,account,password);
		int count = userDao.createUser(myuser);
		if (count > 0) {
			System.out.println("SuccessFul");
		}else {
			System.out.println("Fail");
		}
		
	}
}
