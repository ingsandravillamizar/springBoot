package com.demo.demo.services;

import java.util.List;

import com.demo.demo.repository.entities.Cliente;

public interface ClienteService {
    public List<Cliente>findAll();

    public Cliente findById(Long Id);
    
    public Cliente save(Cliente cliente);
    
    public void delete(Cliente cliente);   //Se envia un objeto de tipo cliente
}
