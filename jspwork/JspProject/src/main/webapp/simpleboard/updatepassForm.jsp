<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu:wght@700&family=Nanum+Pen+Script&family=Single+Day&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style>
	#wrap{
		position:absolute;
		left: 50%;
		top: 50%;
		transform:translate(-50%,-50%);
	}  
</style>
</head>
<body>
<%
	//num값 받기
	String num=request.getParameter("num");
%>
	<div id="wrap">
		<form action="updatepassAction.jsp" method="post">
			<input type="hidden" name="num" value="<%=num%>">
			<div class="input-group">
				<h5 style="width:100px;">비밀번호</h5>
				<input type="password" class="form-control" required="required"
				name="pass" style="width:150px;">
			</div>
			<br>
			<button type="submit" class="btn btn-info">수정시 필요한 비밀번호 확인</button>
		</form>
	</div>
</body>
</html>