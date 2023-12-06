<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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