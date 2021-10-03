<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/Cliente" method="post">
	
		<label for="txtCed">Cedula:</label> 
		<input type="text"	id="textCed" name="cedula"><br> <br> 
		
		<label	for="txtNom">Nombre Completo:</label> 
		<input type="text" id="txtNom"	name="nombre"><br> <br>
		 
		<label	for="txtDir">Direccion:</label> 
		<input type="text" id="txtDir"	name="direccion"><br> <br> 
		
		<label	for="txtTel">Telefono:</label> 
		<input type="text" id="txtTel"	name="telefono"><br> <br>
		
		<label	for="txtEma">Email:</label> 
		<input type="text" id="txtEma"	name="email"><br> <br>  
		
		<input type="submit"	value="Crear">
	</form>
</body>
</html>