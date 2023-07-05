package com.demo.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.demo.demo.repository.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente,Long> {
    
}


//Una Interface tiene la estructura de la logica:  los encabezados
// Interface _______ que extiende (hereda) de ________ y aplica a 