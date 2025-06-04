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

import com.example.demo.model.OrdemServico;
import com.example.demo.repository.OrdemServicoRepository;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ordemServico")

public class OrdemServicoResource {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@GetMapping
	public List<OrdemServico> list(){
		return ordemServicoRepository.findAll();
	}
	
	@PostMapping
	public OrdemServico create(@Valid @RequestBody OrdemServico ordemServico, HttpServletResponse response) {
		return ordemServicoRepository.save(ordemServico);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrdemServico> findById(@PathVariable Long id){
		Optional<OrdemServico> cliente = ordemServicoRepository.findById(id);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}

}

