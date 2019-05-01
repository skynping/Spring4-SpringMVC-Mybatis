<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="customer/test" method="post">
		<input type="text" placeholder="姓名"  name="name"><br>
		<input type="password" placeholder="密码"  name="password"><br>
		<input type="text" placeholder="年龄"  name="age"><br>
		<input type="text" placeholder="用户工具"  name="order.car"><br>
		<input type="text" placeholder="用户资产"  name="order.money"><br>
		<input type="submit" value="提交">
	</form>
	
	<form action="converter/test2" method="post">
		<input type="text" placeholder="姓名"  name="name"><br>
		<input type="text" placeholder="日期"  name="date"><br>
		<input type="submit" value="提交">
	</form>
	
	<a href="anno/testRequestParam?name=haha">RequestParam</a>
	<br>
	<a href="anno/testPathVariable/123">PathVariable</a>
	<br>
	<a href="anno/testModelAttribute">ModelAttribute</a>
	<br>
	<a href="string">返回String类型</a>
	<br>
	<a href="void">返回void类型请求转发</a>
	<a href="void2">返回String2类型请求转发</a>
	<br>
	<a href="void">返回void类型重定向</a>
	<a href="void2">返回String2类型请求转发</a>
</body>
</html>