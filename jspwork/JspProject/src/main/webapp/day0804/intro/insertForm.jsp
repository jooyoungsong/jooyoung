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
<body>
	<form action="insertAction.jsp" method="post">
		<table class="table table-bordered" style="width:300px">
		<tr>
			<th>Name</th>
			<td>
				<input type="text" id="name" name="intro_name" class="form-control"
				required="required" style="width:120px;" palceholder="이름">
			</td>
		</tr>
		<tr>
			<th>Blood Type</th>
			<td>
				<input type="text" name="intro_name" class="form-control"
				required="required" style="width:50px;" palceholder="이름">
			</td>
		</tr>
		<tr>
			<th>Phone number</th>
			<td>
				<div style="float:left">
				<select name="hp1" id="hp" class="form-control" style="width:60px;">
					<option value="010">010</option>
					<option value="011">011</option>
					<option value="016">016</option>
					<option value="017">017</option>
					<option value="019">019</option>
					<option value="070">070</option>
				</select>
				<input type="text" name="hp2" class="form-control"
				required="required" size="3" maxlength="4" style="width:70px;" onkeydown="onKeyDownEvent(event);">
				<input type="text" name="hp3" class="form-control"
				required="required" size="3" maxlength="4" style="width:70px;" onkeydown="onKeyDownEvent(event);">
				</div>
			</td>
		<tr>
			<th>City</th>
			<td>
				<input type="radiobutton" name="city" class="form-control"
				required="required" style="width:50px;">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="submit" class="btn btn-info">전송</button>
				<button type="button" class="btn btn-success"
				onclick="location.href='list.jsp'">목록</button>
			</td>
		</tr>
		</table>
	</form>
	<script type="text/javascript">
		const onKeyDownMovement=(event){
			const inputEl = documet.getElementsByName(event.target.name)[0];
			
			//next input
			if(event.target.value.length===event.target.maxLength
					&&event)
		}
	
	</script>
</body>
</html>