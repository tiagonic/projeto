package br.jus.tse.ProjetoTeste.pessoa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import br.jus.tse.ProjetoTeste.entity.Endereco;
import br.jus.tse.ProjetoTeste.entity.Usuario;

public class PessoaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private LocalDate nascimento;
	private Set<Endereco> enderecos;
	private Set<Usuario> usuarios;
	
	public PessoaDTO() {
		this(null, null, null, null, null);
	}
	
	public PessoaDTO(PessoaEntity entity) {
		this(entity.getId(), entity.getNome(), entity.getNascimento(), entity.getEnderecos(), entity.getUsuarios());
	}

	public PessoaDTO(Long id, String nome, LocalDate nascimento, Set<Endereco> enderecos, Set<Usuario> usuarios) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.enderecos = enderecos;
		this.usuarios = usuarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
