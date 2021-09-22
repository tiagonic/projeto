package br.com.tbs.ProjetoTeste.pessoa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.tbs.ProjetoTeste.endereco.EnderecoEntity;
import br.com.tbs.ProjetoTeste.usuario.UsuarioEntity;

@Entity(name = "pessoa")
@Table(name = "tb_pessoa")
public class PessoaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private LocalDate nascimento;
	
	@OneToMany(mappedBy = "pessoa", fetch = FetchType.EAGER, targetEntity = UsuarioEntity.class)
	private List<UsuarioEntity> usuarios = new ArrayList<UsuarioEntity>();
	
	@ManyToMany(fetch = FetchType.EAGER, targetEntity = EnderecoEntity.class)
	@JoinTable(name = "tb_pessoa_endereco")
	private Set<EnderecoEntity> enderecos = new HashSet<EnderecoEntity>();
	
	public PessoaEntity() {
		this(null, null, null, null, null);
	}

	public PessoaEntity(Long id, String nome, LocalDate dt, List<UsuarioEntity> user, Set<EnderecoEntity> end) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = dt;
		this.usuarios = user;
		this.enderecos = end;
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

	public List<UsuarioEntity> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioEntity> usuarioEntities) {
		this.usuarios = usuarioEntities;
	}

	public Set<EnderecoEntity> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<EnderecoEntity> enderecoEntities) {
		this.enderecos = enderecoEntities;
	}

}
