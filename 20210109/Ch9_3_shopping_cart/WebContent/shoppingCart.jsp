<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List,tw.com.web.bean.Item" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>購物車</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">筆數</th>
					<th scope="col">品名</th>
					<th scope="col">金額</th>
				</tr>
			</thead>
			<tbody>
				<%
					List<Item> list = (List)request.getAttribute("itemList");
					if (list!= null && !list.isEmpty()){
					 int count = 0;	
					 for (Item it: list){
						 count++;
					%>
						<tr>					
							<th scope="row"><%=count%></th>
							<td><%=it.getName()%></td>
							<td><%=it.getPrice()%>$</td>
						</tr>
					<%} %>
				<%}else{%>
					
					<tr>					
					<th scope="row"></th>
					<td>購物車空快去買!</td>
					<td></td>
				</tr>	
				
				<% }%>
				
			</tbody>
		</table>
	</div>
</body>
</html>