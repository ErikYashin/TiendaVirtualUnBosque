package com.tiendavirtual.dto;

// ?cedula=54647484&nombre=pepe&direccion=9090&telefono=656565&email=pepe@gmail.com

public class Cliente {
	private String cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	private String email;
	
	public Cliente(String cedula, String nombre, String direccion, String telefono, String email) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
