<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Trainee Detail:<br>
		<%@ taglib prefix="d"  uri="http://java.sun.com/jstl/core_rt" %>
		<table border=2px cellpadding=2px>
			<tr>
				<td>TraineeId</td>
				<td>Trainee name</td>
				<td>Trainee Location</td>
				<td>Trainee Domain</td>
				</tr>
				<tr>
					<td>${t.id}</td>
					<td>${t.name}</td>
					<td>${t.loc }</td>
					<td>${t.domain }</td>
				</tr>
				
		</table>	
</body>
</html>