package br.com.jupiter.jupiter.rest;

import br.com.jupiter.jupiter.entity.Cliente;
import br.com.jupiter.jupiter.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("cliente")
public class ClienteRest {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }
}
