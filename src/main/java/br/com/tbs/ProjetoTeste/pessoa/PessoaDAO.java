package br.com.tbs.ProjetoTeste.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

interface PessoaDAO extends JpaRepository<PessoaEntity, Long> {
	
}
