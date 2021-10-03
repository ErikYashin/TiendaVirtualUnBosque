<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function enviarDatos() {
		var valido = validar();
		if (valido) {
			alert("Los datos son validos");
			var usuario = document.getElementById("txtUser").value.trim();
			var password = document.getElementById("txtPass").value.trim();
			
			var mensajero = new XMLHttpRequest();
			
			var url = '/TiendaVirtualProt1/SrvRegistroUsuario';
			var params = "user=" + usuario + "&" + "pass=" + password;
			mensajero.open('POST', url, true);
			
			mensajero.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
			
			mensajero.onreadystatechange = function() {
				if (mensajero.readyState == 4 && mensajero.status == 200) {
					//alert(mensajero.responseText);
					var myDiv = document.getElementById("dvTabla");
					myDiv.innerHTML = "<b>"+mensajero.responseText+"</b>";
				}
			}
			mensajero.send(params);
			
		} else {
			alert("Los datos no son validos");
		}
		return;
	}
	function validar() {
		var txtU = document.getElementById("txtUser");
		var txtP = document.getElementById("txtPass");
		if (txtU.value.trim().length == 0) {
			alert("El usuario no puede estar vacio");
			return false;
		} else if (txtP.value.trim().length == 0) {
			alert("El password no puede estra vacio");
			return false;
		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h1>Bienvenido a su tienda virtual.</h1>
	<label for="txtUser">User Name:</label>
	<input type="text" id="txtUser">
	<br>
	<br>
	<label for="txtPass">Password:</label>
	<input type="password" id="txtPass">
	<br>
	<br>
	<button onclick='enviarDatos();'>Logueate</button>
	<br>
	<br>
	<a href="formClientes.jsp">Ir a la pagina de registro de clientes</a>
	<br>
	<br>
	<div id="dvTabla">	
	</div>
</body>
</html>