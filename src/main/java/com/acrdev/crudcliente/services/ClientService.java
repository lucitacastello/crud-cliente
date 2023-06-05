package com.acrdev.crudcliente.services;


import com.acrdev.crudcliente.dto.ClientDTO;
import com.acrdev.crudcliente.entities.Client;
import com.acrdev.crudcliente.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> clients = repository.findAll(pageable);
        return clients.map(recordsFound -> new ClientDTO(recordsFound));
    }
}
