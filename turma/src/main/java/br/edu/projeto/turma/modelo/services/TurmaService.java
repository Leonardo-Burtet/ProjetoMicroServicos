package br.edu.projeto.turma.modelo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.projeto.turma.modelo.entidade.Turma;
import br.edu.projeto.turma.modelo.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	public List<Turma> getAll(){
		return (List<Turma>) turmaRepository.findAll();
	}
}
