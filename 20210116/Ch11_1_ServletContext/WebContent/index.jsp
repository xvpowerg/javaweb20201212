<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
setInterval(()=>{
	location.reload(true);
    },5000);

</script>
<body>
<!-- 
EL語法

可以特別指定 scope pageScope  requestScope sessionScope applicationScope 
-->
count:${applicationScope["count"]} <br/>
count:${applicationScope.count}<br/>
count:${count}<br/>
</body>
</html>