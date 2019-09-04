package com.eam.megainventario.inventario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.megainventario.inventario.entity.Cliente;
import com.eam.megainventario.inventario.repository.ClienteRepository;
import com.eam.megainventario.inventario.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente buscarClientePorId(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).get();
	}

	@Override
	public int crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

}
