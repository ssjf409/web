<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<c:set var="varName" value="varValue"/>
	varName : <c:out value="${varName}"/> <br/>

	<c:remove var="varName" />
	varName : <c:out value="${varName}"/>
	
	
</body>
</html>