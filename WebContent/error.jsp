<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>error</title>
</head>
<body>
	<center>
		<h2>
			Following error occurred while trying to send your email:
		</h2>
		<p>
			<font color="red">${exception.message}</font>
		</p>
	</center>
</body>
</html>