package com.ysoberon.proyectoTelefonica.models.servicios;

import java.util.List;

import com.ysoberon.proyectoTelefonica.models.domain.Cliente;

 

public interface IClienteService {
	
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente  findById(Long id);

}
