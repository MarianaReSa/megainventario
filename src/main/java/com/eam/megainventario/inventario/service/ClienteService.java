package com.eam.megainventario.inventario.service;

import com.eam.megainventario.inventario.entity.Cliente;

public interface ClienteService {

	public abstract Cliente buscarClientePorId(Integer id);
	
	public abstract int crearCliente(Cliente cliente);
}
