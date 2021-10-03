package com.uelbosque.tiendavirtual;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendavirtual.dao.ClienteDAO;
import com.tiendavirtual.dto.Cliente;

@RestController
public class TiendaVirtualControlador {
	@RequestMapping("/crearCliente")
	public String InsertarCliente(Cliente c) {
		ClienteDAO dao = new ClienteDAO();
		dao.insertarCliente(c);
		return "Microservicio de insercion de clientes";
	}

	@RequestMapping("/buscarCliente")
	public String ConsultarCliente() {
		return "Microservicio de consulta de clientes";
	}
}