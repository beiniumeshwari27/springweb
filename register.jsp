<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registeruser" method="post">
Name:<input type="text" name="name"><br><br>
Password:<input type="password" name="password"><br><br>
Email:<input type="email" name="email"><br><br>
Address:<input type="textarea" name="address" rows="4"><br><br>
Mobile:<input type="text" name="mobile" pattern="[0-9]{10}"><br><br>
<input type="submit"value="Register"/>
</form>
</body>
</html>