package com.eam.megainventario.inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eam.megainventario.inventario.entity.Cliente;
import com.eam.megainventario.inventario.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	protected Cliente buscarClientePorId(@PathVariable("id") String id) {
		return clienteService.buscarClientePorId(Integer.parseInt(id));
	}
}
