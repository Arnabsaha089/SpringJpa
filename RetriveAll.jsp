<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Trainee Dteails:<br>
		<%@ taglib prefix="d"  uri="http://java.sun.com/jstl/core_rt"%>
		<table border=2px cellpadding=2px>
			<tr>
				<td>TraineeId</td>
				<td>Trainee name</td>
				<td>Trainee Location</td>
				<td>Trainee Domain</td>
				</tr>
				
				<d:forEach var="tr" items="${list}">
				<tr>
					<td>${tr.id}</td>
					<td>${tr.name}</td>
					<td>${tr.loc }</td>
					<td>${tr.domain }</td>
				</tr>
				</d:forEach>
		</table>	
</body>
</html>