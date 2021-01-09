package tw.com.web.tools;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.openejb.server.httpd.HttpRequest;

import tw.com.web.bean.Order;
import java.util.Optional;

public class OrderSessionTool {
	
	public static final String ORDER_NAME = "order";
	
	public  static void orderToSession(HttpServletRequest req,Order order) {
			HttpSession session = req.getSession();
			session.setAttribute(ORDER_NAME, order);		
	}
	
	public  static Optional<Order> getOrderBySession(HttpServletRequest req) {
		HttpSession session = req.getSession();
		Order order = (Order)session.getAttribute(ORDER_NAME);
		return Optional.ofNullable(order);
		
}
	
}
