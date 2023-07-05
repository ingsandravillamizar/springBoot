package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.repository.entities.Cliente;
import com.demo.demo.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
   @Autowired
   private ClienteService clienteService;

   @GetMapping("/clientes")
   public List<Cliente> index(){
       return clienteService.findAll();
   }

}
