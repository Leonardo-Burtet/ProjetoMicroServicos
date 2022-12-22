package br.edu.projeto.matricula.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.projeto.matricula.modelo.entidade.Matricula;

@Repository
public interface MatriculaRepository extends CrudRepository<Matricula, Long>{
	
}
