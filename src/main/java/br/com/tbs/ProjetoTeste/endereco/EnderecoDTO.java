package br.com.tbs.ProjetoTeste.endereco;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.tbs.ProjetoTeste.pessoa.PessoaDTO;

public class EnderecoDTO implements Serializable, Comparable<EnderecoDTO>{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;
	Set<PessoaDTO> pessoas = new HashSet<PessoaDTO>();


	public EnderecoDTO() {
		super();
	}

	public EnderecoDTO(EnderecoEntity entity) {
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
	}

	@Override
	public int compareTo(EnderecoDTO o) {
		return descricao.compareTo(o.getDescricao());
	}

	@Override
	public boolean equals(Object o) {
		return (o instanceof EnderecoDTO && descricao.equals(((EnderecoDTO) o).getDescricao()));
	}

	@Override
	public int hashCode() {
		return Integer.parseInt( this.id.toString() );
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<PessoaDTO> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Set<PessoaDTO> pessoas) {
		this.pessoas = pessoas;
	}

}
