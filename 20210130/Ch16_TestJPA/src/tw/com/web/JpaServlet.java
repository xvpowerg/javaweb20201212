package tw.com.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.entity.MyUser;
@WebServlet("/jpaservlet")
public class JpaServlet extends HttpServlet{
	@Inject
	EntityManager em;
	@EJB
	private MyUserBeanLocal myUserBean;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			MyUser myuser = new MyUser();
			myuser.setAccount("Howard");
			myuser.setPassword("123456");
			myUserBean.createUser(myuser);
		
		MyUser queryMyUser = myUserBean.findMyUser("Howard", "123456");
		System.out.println(queryMyUser);
		}
		
		
}
