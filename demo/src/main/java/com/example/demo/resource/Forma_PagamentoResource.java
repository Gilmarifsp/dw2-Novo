package com.example.demo.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public class Forma_PagamentoResource {

	@Autowired
	private Forma_PagamentoRepository activityRepository;
	
	@GetMapping
	public List<Activity> list(){
		return activityRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Activity> findById(@PathVariable Long id) {
		Optional<Activity> activity = activityRepository.findById(id);
		if(activity.isPresent()) {
			return ResponseEntity.ok(activity.get());
		}
		return ResponseEntity.notFound().build();
	}
}
