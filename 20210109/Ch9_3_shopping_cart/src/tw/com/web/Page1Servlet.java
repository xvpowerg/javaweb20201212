package tw.com.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.web.bean.Item;
import tw.com.web.bean.Order;
import tw.com.web.tools.OrderSessionTool;

import java.util.stream.Collectors;
import java.util.stream.Stream;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
private static Map<String,Item> itemMap = new HashMap();	
	static{
		itemMap.put("1", new Item("PS5",35000));
		itemMap.put("2", new Item("Switch",7500));
		itemMap.put("3", new Item("iPhone12",26000));
		
		
	}
			@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Order order = new Order();		
		String[] items = req.getParameterValues("item");
	List<Item> itemList =  Stream.<String>of(items).
	 filter(key->itemMap.containsKey(key)).
		map(key->itemMap.get(key)).
		collect(Collectors.toList());
	order.addAllItem(itemList);
	OrderSessionTool.orderToSession(req, order);
	
	//專屬於Servlet轉Servlet
	//req.getRequestDispatcher("/page2").forward(req, resp);
	//轉換某頁面
	resp.sendRedirect("page2.html");
	}
}
