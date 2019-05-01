<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="../js/jquery-1.12.1.min.js"></script>
<script>
	$(function() {
		$("#btn").click(function() {
			$.ajax({
				url:'testAjax',
				contentType:"application/json;charset=UTF-8",
				data:"{'name':'小张','age':12,'id':1}",
				dataType:'json',
				type:"post",
				success:function(data){	
					if(data.success){
						/* 跳转页面 */
						location.href="${pageContext.request.contextPath}/jsp/hello.jsp";
					}else{
						alert(data.message);
					}
				}
			})
			
			/* $.post('testAjax',{'name':'小张','age':12,'id':1},function(){
				console.log(data);
			}) */
			
			
		})
	})
</script>
<body>
	<input type="button" value="发送json" id="btn">
</body>
</html>