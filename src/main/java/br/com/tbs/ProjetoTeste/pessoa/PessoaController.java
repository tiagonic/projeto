package br.com.tbs.ProjetoTeste.pessoa;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping("all")
	public ResponseEntity<Set<PessoaDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("find-by-id")
	public ResponseEntity<Optional<PessoaDTO>> findById(@RequestParam(defaultValue = "0") Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<Optional<PessoaDTO>> findByPathId(@PathVariable(value = "id", required = false) Long id) {
		return this.findById(id);
	}
	
	

}
