<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.util.TreeSet"  %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!  
void test(){
	
}

%>
<%=request.getAttribute("req_msg") %>
<%=session.getAttribute("sess_msg") %>
<%=application.getAttribute("app_msg") %>

<body>
		
<!-- EL -->

<P>req_msg:${requestScope["req_msg"] }</P>
<P>sess_msg:${sessionScope["sess_msg"] }</P>
<P>sess_msg:${applicationScope["app_msg"] }</P>
<P>req_msg:${"req_msg" }</P>
</body>
</html>