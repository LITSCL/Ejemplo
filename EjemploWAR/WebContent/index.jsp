<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
	<form action="SumarControlador" method="GET">
		<label>Número 1<input type="number" name="numero1"></label><br/>
		<label>Número 2<input type="number" name="numero2"></label><br/>
		<input type="submit" value="Enviar">
	</form>
	${resultadoSuma}
</body>
</html>