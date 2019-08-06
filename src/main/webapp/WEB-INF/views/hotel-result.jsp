<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<p>Welcome to the Grand Circus Hotel Search!</p>


<c:forEach var="i" items="${hotels}">
		<p>${i.name} ${i.city} ${i.pricePerNight}</p>
</c:forEach>





</body>
</html>