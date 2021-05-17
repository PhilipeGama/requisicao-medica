package br.edu.ifam.consultorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifam.consultorio.model.Prontuario;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long>{

}
