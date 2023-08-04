<%@page import="model.sinsang.SinsangDto"%>
<%@page import="model.sinsang.SinsangDao"%>
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
<%
	String num=request.getParameter("num");
	SinsangDao dao=new SinsangDao();
	SinsangDto dto=dao.getData(num);
%>
</head>
<body>
	<form action="updateAction.jsp" method="post">
	
	<!--hidden은 위치상관 없다. 폼 안에만 있으면 된다! -->
	<input type="hidden" name="num" value="<%=num%>">
		<table class="table table-bordered" style="width:400px;">
			<tr>
				<th>이름</th>
					<td>
						<input type="text" name="name" style="width:150px;"
						value="<%=dto.getName()%>">
					</td>
			</tr>
			<tr>
				<th>주소</th>
					<td>
						<input type="text" name="addr" style="width:250px;" 
						value="<%=dto.getAddr()%>">
					</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="수정" class="btn btn-warning">
					<input type="button" value="목록" onclick="location.href='list.jsp'" class="btn btn-success">
				</td>
			</tr>
		</table>
		</form>
</body>
</html>