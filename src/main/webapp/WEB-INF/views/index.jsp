<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="city-form">
	<form action="/hotel-result" id="form">
		<select name="city">
			<option value="">----------</option>
			<option value="Ann Arbor">Ann Arbor</option>
			<option value="Dearborn">Dearborn</option>
			<option value="Detroit">Detroit</option>
		</select>
		<button type="submit">Submit</button>
	</form>
</div>

</body>
</html>