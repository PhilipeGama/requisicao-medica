package br.edu.ifam.consultorio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifam.consultorio.model.Prontuario;
import br.edu.ifam.consultorio.repository.ProntuarioRepository;

@Service
public class ProntuarioService {
	
	@Autowired
	private ProntuarioRepository prontuarioRepository;
	
	public List<Prontuario> listarProntuarios(){
		return prontuarioRepository.findAll();
	}
	
	public Optional<Prontuario> listarProntuario(Long id){
		return prontuarioRepository.findById(id);
	}
	
	public Prontuario salvar(Prontuario prontuario) {
		return prontuarioRepository.save(prontuario);
	}
	
	public Prontuario atualizar(Prontuario prontuario) {
		return prontuarioRepository.save(prontuario);
	}
	
	public void excluir(Long id) {
		prontuarioRepository.deleteById(id);
	}
}
