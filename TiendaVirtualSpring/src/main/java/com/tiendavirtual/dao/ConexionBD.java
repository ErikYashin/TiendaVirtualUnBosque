package com.tiendavirtual.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	
	private String bd = "tienda_virtual";
	private String login = "root";
	private String passw = "admin";
	private String url = "jdbc:mysql://localhost/" + bd;
	
	public Connection getConexionBD() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, login, passw);
			if (con != null) {
				System.out.println("Conexion a base de datos " + bd + " Ok\n");
				
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
		
	}

}
