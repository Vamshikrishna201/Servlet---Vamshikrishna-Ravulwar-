<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="MyServlet" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td> <input type="text" placeholder="Enter Name" name="name"/> </td>
		</tr>
	
		<tr>
			<td>City:</td>
			<td> <input type="text" placeholder="Enter City" name="city" /> </td>
		</tr>
	
		<tr>
			<td> <input type="submit" name="submit" /> </td>
		</tr>
	</table>	

</form>

</body>
</html>