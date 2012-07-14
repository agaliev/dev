<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach items="${shoppingcart.items}" var="article">
			<tr>
				<td>${article.name}</td>
				<td>${article.price}</td>
			</tr>
		</c:forEach>
	</table>
	<c:out value="total ${shoppingcart.total} $"></c:out>
</body>
</html>