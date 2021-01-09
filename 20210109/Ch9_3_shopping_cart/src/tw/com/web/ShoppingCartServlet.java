package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.bean.Item;
import tw.com.web.bean.Order;
import tw.com.web.tools.OrderSessionTool;

@WebServlet("/shoppingCart")
public class ShoppingCartServlet extends HttpServlet  {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//可回到此處查看購買的產品
			 Optional<Order> optionOrder =  OrderSessionTool.getOrderBySession(req);
			 List<Item> itList = new ArrayList<>();
			 if (optionOrder.isPresent()) {
			  	 Order order = optionOrder.get();			  	 
			  	order.foreachItemList(it->{			  		
			  		itList.add(it);
			  	});						  
			 }
			 
			 
			 req.setAttribute("itemList", itList);
			 req.getRequestDispatcher("/shoppingCart.jsp").forward(req, resp);
		}
}
