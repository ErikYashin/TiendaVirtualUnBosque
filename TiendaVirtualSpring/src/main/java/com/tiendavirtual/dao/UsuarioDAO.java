package com.tiendavirtual.dao;

import java.sql.SQLException;
import java.sql.Statement;
import com.tiendavirtual.dto.Usuario;

public class UsuarioDAO {
	public void insertarUsuario(Usuario u) {
		ConexionBD Conex = new ConexionBD();		
		try {
			Statement stmt = Conex.getConexionBD().createStatement();
			stmt.executeUpdate("INSERT INTO usuarios(nombre, password) VALUES (" + "'" + u.getNombre() + "'" + "," + "'"+ u.getPassword() +"'" + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void buscarUsuario() {		

	}

	public void actualizarUsuario() {

	}

	public void borrarUsuario() {

	}
}
