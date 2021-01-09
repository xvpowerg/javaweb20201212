package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Optional;

import tw.com.web.bean.Order;
import tw.com.web.tools.OrderSessionTool;
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
			@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//§é»ù¨÷ 
			//¦a§}....
				String coupon = req.getParameter("coupon");
				String  addr = req.getParameter("addr");
				 int couponInt = Integer.parseInt(coupon);								
				 Optional<Order> orderOpt = 
						 OrderSessionTool.getOrderBySession(req);
				 if (orderOpt.isPresent()) {
					 Order order = orderOpt.get();
					 order.setAddr(addr);
					 order.setCoupon(couponInt);
				 }				
				 
				 
				 
				 resp.sendRedirect("page3.jsp"); 
	  }
}
