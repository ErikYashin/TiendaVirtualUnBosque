package com.tiendavirtual.dao;

import java.sql.SQLException;
import java.sql.Statement;
import com.tiendavirtual.dto.Cliente;

public class ClienteDAO {	
	public void insertarCliente(Cliente c) {		
		ConexionBD Conexc = new ConexionBD();		
		try {
			Statement stmtc = Conexc.getConexionBD().createStatement();
			stmtc.executeUpdate("INSERT INTO clientes(cedula_cliente, nombre_cliente, dir_cliente, tel_cliente, email_cliente) VALUES (" + "'" + c.getCedula() + "'" + "," + "'" + c.getNombre() + "'" + "," + "'" + c.getDireccion() + "'" + "," + "'" + c.getTelefono() + "'" + "," + "'" + c.getEmail() + "'" +")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void buscarCliente() {
		
	}
	public void actualizarCliente() {
		
	}
	public void borrarCliente() {
		
	}

}
