package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Forma_Pagamento;
import com.example.demo.repository.Forma_PagamentoRepository;

@RestController
@RequestMapping("/pagamento")
public class Forma_PagamentoResource {

	@Autowired
	private Forma_PagamentoRepository forma_PagamentoRepository;
	
	@GetMapping
	public List<Forma_Pagamento> list(){
		return forma_PagamentoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Forma_Pagamento> findById(@PathVariable Long id) {
		Optional<Forma_Pagamento> forma_Pagamento = forma_PagamentoRepository.findById(id);
		if(forma_Pagamento.isPresent()) {
			return ResponseEntity.ok(forma_Pagamento.get());
		}
		return ResponseEntity.notFound().build(); 
	}
}
