<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tw.com.web.tools.OrderSessionTool" %>    
<%@ page import="java.util.Optional" %>   
<%@ page import="tw.com.web.bean.Order" %>   
<%@ page import="tw.com.web.bean.Item" %>
<%@ page import="java.util.ArrayList" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>訂單詳情</title>
</head>
<body>
	<%
	//JSP 的程式碼區間
	
	%>
		<%
	Optional<Order> optional= 
			OrderSessionTool.getOrderBySession(request);
		if (optional.isPresent()){
			Order order = optional.get();		
	%>
	<!-- 表示輸出  -->
	<H3>總價:<%=order.getTotal() %></H3>
	<H3>地址:<%=order.getAddr()%></H3>
	<ol>
		<%
		final ArrayList<Item> list = new ArrayList<>();
		order.foreachItemList((Item it)->{	
			list.add(it);
		});
		%>
		
		<%
		for(Item it : list){
		%>
		    <li><%=it.getName()%></li>
		<%} %>
		
	</ol>
	<form action="">
	 <button>確定</button>
	 </form>
	 <%} %>
</body>
</html>