package br.edu.projeto.turma.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.projeto.turma.modelo.entidade.Turma;

@Repository
public interface TurmaRepository extends CrudRepository<Turma, Long> {

}
