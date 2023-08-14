<%@page import="java.text.SimpleDateFormat"%>
<%@page import="member.model.memberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="member.model.memberDao"%>
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
</head>
<%
	memberDao dao=new memberDao();
	ArrayList<memberDto> list=dao.selectMember();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
%>
<body>
<div>
	<button type="button" value="로그인" class="btn btn-outline-success btn-sm"
	onclick="location.href='addForm.jsp'">로그인</button>
</div>
	<br>
	<table class="table table-bordered" style="width:1200px;">
		<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>회원명</th>
				<th>핸드폰</th>
				<th>가입일</th>
				<th>관리</th>
		</tr>
		<tr>총 회원수는 <%=list.size() %>명입니다</tr>
		<br><br>
		
	<% for(int i=0;i<list.size();i++)
		{
			memberDto dto=list.get(i);
			
			%>
			
			<tr>
				<td><%=(i+1) %></td>
				<td><%=dto.getId() %></td>
				<td>
					<img src='<%=dto.getImage() %>' width="150px;" height="150px;">
					<br>
					<%=dto.getName() %>
				</td>
				<td><%=dto.getHp() %></td>
				<td><%=sdf.format(dto.getGaip()) %></td>
				<td><input type="button" class="btn btn-success btn-xs" value="수정"
				onclick="location.href='updateForm.jsp'"?num=<%=dto.getNum() %>>
				<input type="button" class="btn btn-danger btn-xs" value="삭제"
				onclick="location.href='deleteForm.jsp'"?num=<%=dto.getNum() %>></td>
			</tr>
		<%}
	%>
		
	</table>
</body>
</html>