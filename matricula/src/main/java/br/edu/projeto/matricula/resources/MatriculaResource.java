package br.edu.projeto.matricula.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.edu.projeto.matricula.clients.AlunoClient;
import br.edu.projeto.matricula.resources.dto.AlunoDTO;
import br.edu.projeto.matricula.resources.dto.MatriculaDTO;
import br.edu.projeto.matricula.resources.dto.MatriculaResponseDTO;
import br.edu.projeto.matricula.resources.dto.TurmaAlunoDTO;

@RestController
@RequestMapping("/matriculas")
public class MatriculaResource {
	
	private static Logger log = LoggerFactory.getLogger(MatriculaResource.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${aluno.endpoint.url}")
	private String alunoApiUrl;
	
	@Autowired
	private AlunoClient alunoClient;
	
	@PostMapping
	public MatriculaResponseDTO matricular(@RequestBody MatriculaDTO matriculaDTO) {
		log.info("solicitacao para pedido com a informação: {}", matriculaDTO);
		
		if(log.isDebugEnabled()) {
			log.debug("Debug ligado");
		}
		AlunoDTO alunoDTO = restTemplate.getForObject(alunoApiUrl+
					matriculaDTO.getAlunoId(), AlunoDTO.class);
		log.info("Chamada a api de clientes realizada: {}", alunoDTO);
		
		ResponseEntity<List<TurmaAlunoDTO>> turmas = alunoClient.getAlunos();
		
		return new MatriculaResponseDTO(alunoDTO, turmas.getBody());
		
	}

}