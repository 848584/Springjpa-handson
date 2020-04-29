<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Countries</title>
</head>
<body>
	<input list="countries" placeholder="Enter Country" name=search>
	<datalist id="countries">
		<c:forEach items="${countryList}" var="country">
			<option value="${country.code} ${country.name}">
		</c:forEach>
	</datalist>

</body>
</html>