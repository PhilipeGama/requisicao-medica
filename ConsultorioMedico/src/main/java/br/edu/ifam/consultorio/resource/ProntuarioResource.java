package br.edu.ifam.consultorio.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifam.consultorio.model.Prontuario;
import br.edu.ifam.consultorio.service.ProntuarioService;

@RestController
@RequestMapping("/prontuario")
public class ProntuarioResource {
	
	@Autowired
	ProntuarioService prontuarioService;
	
	@GetMapping
	public List<Prontuario> getProntuarios(){
		return prontuarioService.listarProntuarios();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Prontuario> getProntuario(@PathVariable Long id){
		Optional<Prontuario> prontuario = prontuarioService.listarProntuario(id);
		
		if(prontuario.isPresent())
			return ResponseEntity.ok(prontuario.get());
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Prontuario setProntuario(@RequestBody Prontuario prontuario) {
		return prontuarioService.salvar(prontuario);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Prontuario> updateContato(@PathVariable Long id,
			@RequestBody Prontuario prontuario) {
		
		if(prontuarioService.listarProntuario(id).isPresent()) {
			prontuario.setNumero(id);
			return ResponseEntity.ok(prontuarioService.atualizar(prontuario));
		}
		
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProntuario(@PathVariable Long id){
		if(prontuarioService.listarProntuario(id).isPresent()) {
			prontuarioService.excluir(id);
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}