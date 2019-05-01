<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 文件上传 -->
	<form action="upload/pic" method="post" enctype="multipart/form-data">
		<input type="file" value="上传图片" name="picture">
		<input type="submit" value="提交">
	</form>
	<a href="upload/pic">test</a>
</body>
</html>