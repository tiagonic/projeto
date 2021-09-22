package br.com.tbs.ProjetoTeste.pessoa;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaDAO dao;
	
	@Transactional(readOnly = true)
	public List<PessoaDTO> findAll() {
		List<PessoaEntity> lista = dao.findAll();
		return lista.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Optional<PessoaDTO> findById(Long id) {
		 Optional<PessoaEntity> op = dao.findById(id);
		 return op.map(x -> new PessoaDTO(x));
	}

}
