<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
	<h1>ログイン</h1>
	<form action="LoginServlet" method="post">
		<table>

			<label>ID</label><br/>
			<input type="text" name="stu_id"/>
			<br/><br/>

			<label>Password</label><br/>
			<input type="password" name="stu_password">
			<br/><br/>
	</table>
	<input type="submit" name="submit" value="Login"/>
	<br/>

	</form>
</body>
</html>