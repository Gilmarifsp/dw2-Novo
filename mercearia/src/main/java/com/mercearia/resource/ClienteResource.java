package com.mercearia.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercearia.model.Cliente;
import com.mercearia.repository.ClienteRepository;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	@Autowired
	private ClienteRepository clienteRepository;
    @GetMapping
    public List<Cliente> listarClientes() {
    	return clienteRepository.findAll();

    }
    
	@PostMapping
	public Cliente create(@RequestBody Cliente cliente, HttpServletResponse response) {
		return clienteRepository.save(cliente);
}
}
