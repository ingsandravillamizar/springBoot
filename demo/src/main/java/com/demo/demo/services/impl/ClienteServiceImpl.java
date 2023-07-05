package com.demo.demo.services.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.demo.repository.ClienteRepository;
import com.demo.demo.repository.entities.Cliente;
import com.demo.demo.services.ClienteService;



@Service
public  class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
       return (List<Cliente>) clienteRepository.findAll();
       
    }

    @Override
    public Cliente findById(Long Id) {
       return clienteRepository.findById(Id).orElse(null);
    }

    @Override
    @Transactional()
    public Cliente save(Cliente cliente) {
      return clienteRepository.save(cliente);
    }

    @Override
       @Transactional()
    public void delete(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
    
}


//Clases que implementan la interface
