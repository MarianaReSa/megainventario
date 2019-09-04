package com.eam.megainventario.inventario.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eam.megainventario.inventario.entity.Cliente;
import com.eam.megainventario.inventario.enumeration.EstadoEnum;

@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

	public abstract Cliente findByIdAndEstado(String nombre, EstadoEnum estado);
}
