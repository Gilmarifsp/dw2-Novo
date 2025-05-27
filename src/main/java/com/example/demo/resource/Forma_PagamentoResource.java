package com.example.demo.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Forma_Pagamento;
import com.example.demo.repository.Forma_PagamentoRepository;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class Forma_PagamentoResource {

	
	@Autowired
	private Forma_PagamentoRepository Forma_PagamentoRepository;
	
	@GetMapping
	public List<Forma_Pagamento> list(){
		return Forma_PagamentoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Forma_Pagamento> findById(@PathVariable Long id) {
		Optional<Forma_Pagamento> activity = Forma_PagamentoRepository.findById(id);
		if(activity.isPresent()) {
			return ResponseEntity.ok(activity.get());
		}
		return ResponseEntity.notFound().build();
	}
}
