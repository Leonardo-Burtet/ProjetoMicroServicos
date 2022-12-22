package br.edu.projeto.matricula.modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.projeto.matricula.modelo.entidade.Matricula;
import br.edu.projeto.matricula.modelo.repository.MatriculaRepository;

@Service
public class MatriculaService {
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	public Matricula getByCodigo(Long codigo) {
		Matricula matricula = matriculaRepository.findById(codigo).get();
		return matricula;
		
	}
}
