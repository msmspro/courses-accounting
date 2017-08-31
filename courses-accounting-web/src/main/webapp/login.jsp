<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="web_resources/style.css">
<title>login</title>
</head>
<body>
<a href="./">назад</a>

<div align="center">
	
	<form action="/courses-accounting/login" method="post" >
	

		<input name="login" placeholder="Логин" required="required"><br>

		<input type="password" name="password" placeholder="Пароль" required="required"><br>
		
		<input type="checkbox" name="view_password" id="password_view"><label for="password_view">Вывести пароль</label><br>
		
		<input type="submit" name="submit">
	
	</form>
	
</div>

</body>
</html>