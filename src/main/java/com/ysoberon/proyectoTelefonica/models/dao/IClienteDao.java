package com.ysoberon.proyectoTelefonica.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ysoberon.proyectoTelefonica.models.domain.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
 