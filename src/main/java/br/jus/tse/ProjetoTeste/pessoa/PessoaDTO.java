package br.jus.tse.ProjetoTeste.pessoa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import br.jus.tse.ProjetoTeste.endereco.EnderecoEntity;
import br.jus.tse.ProjetoTeste.usuario.UsuarioEntity;

public class PessoaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private LocalDate nascimento;
	private Set<EnderecoEntity> enderecos;
	private List<UsuarioEntity> usuarios;
	
	public PessoaDTO() {
		this(null, null, null, null, null);
	}
	
	public PessoaDTO(PessoaEntity entity) {
		this(entity.getId(), entity.getNome(), entity.getNascimento(), entity.getEnderecos(), entity.getUsuarios());
	}

	public PessoaDTO(Long id, String nome, LocalDate dt, Set<EnderecoEntity> e, List<UsuarioEntity> u) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = dt;
		this.enderecos = e;
		this.usuarios = u;
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

	public void setNascimento(LocalDate dt) {
		this.nascimento = dt;
	}

	public Set<EnderecoEntity> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<EnderecoEntity> e) {
		this.enderecos = e;
	}

	public List<UsuarioEntity> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioEntity> u) {
		this.usuarios = u;
	}
	
}
