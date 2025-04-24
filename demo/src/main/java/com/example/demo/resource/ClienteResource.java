package com.example.demo.resource;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

import jakarta.servlet.http.HttpServletResponse;




@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> list(){
		return clienteRepository.findAll();
		

	}
	
	@PostMapping
	public Cliente create(  @RequestBody Cliente cliente, HttpServletResponse response) {
		return clienteRepository.save(cliente);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable Long id){
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}
}
