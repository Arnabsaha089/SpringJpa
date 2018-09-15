<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Enter Trainee Details....</h2>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
	<f:form action="addService.obj" modelAttribute="t">
		
		Trainee id:<f:input path="id" /><br>
		
		Trainee name:<f:input  path="name" /><br>
		
		Trainee Location:<f:radiobutton path="loc" value="Mumbai" />Mumbai
						<f:radiobutton path="loc" value="Kolkata"/>Kolkata
						<f:radiobutton path="loc" value="Chennai"/>Chennai
						<f:radiobutton path="loc" value="Delhi"/>Delhi<br>
						
						
		Trainee Domain: <f:select  path="Domain">
							<f:option value="JEE">JEE</f:option>
							<f:option value=".net">.NET</f:option>
							<f:option value="System">MainFrame</f:option>
							<f:option value="sql">Business Intelligence</f:option>
						</f:select>
		<input type="submit" value="ADD TRAINEE"/>
		
	</f:form>
	
</body>
</html>