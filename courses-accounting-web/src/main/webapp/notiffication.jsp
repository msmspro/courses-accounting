<%@page import="com.intelisoft.courses.accounting.models.User"%>
<%@page import="java.util.List"%>
<%@page
	import="com.intelisoft.courses.accounting.services.UserServiceImpl"%>
<%@page
	import="com.intelisoft.courses.accounting.api.services.IUserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>notiffications</title>
</head>
<body>
	<div align="center">
		<form action="notification" method="post">
			<table>
				<tr>
					<td align="center">
						<h1>Создать напоминание</h1> <br>
					</td>
				</tr>
				<tr>
					<td align="center">дата и время напоминания:<br> <input
						type="datetime-local" name="notice_date_time" required>
					</td>
				</tr>
				<tr>
					<td>сообщение напоминания:<br> <textarea name="message"
							rows="10" cols="50" required></textarea>
					</td>
				</tr>
				<tr>
					<td align="right">метод оповещения<br> <select
						name="notiffication_type">
							<option selected value="OPERATOR">оповестить оператора</option>
							<option value="E_MAIL">выслать на e-mail</option>
					</select>
					</td>
				</tr>


				<%IUserService service = new UserServiceImpl();
						List<User> users = service.unproxy(service.getAll());
						if(!users.isEmpty()){%><table border="1"><%
						for(User user:users){
							%>
				<tr>
					<td>
						<input type="checkbox" name="<%= user.getId()%>">
					</td>
					<td>
						<%=user.getFirstName()%>
					</td>
					<td>
						<%=user.getLastName()%>
					</td>
					<td>
						<%=user.getPhoneNumber()%>
					</td>
					<td>
						<%=user.getEMail()%>
					</td>
				</tr></table>
				<%}}else{%><tr><td>нет адресатов для выбора</td></tr><%}%>

				<tr>
					<td align="right">
						<hr> <input type="submit">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>