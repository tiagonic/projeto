package br.jus.tse.ProjetoTeste.pessoa;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.jus.tse.ProjetoTeste.entity.Endereco;
import br.jus.tse.ProjetoTeste.entity.Usuario;

@Entity(name = "pessoa")
@Table(name = "tb_pessoa")
public class PessoaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private LocalDate nascimento;
	
	@OneToMany(mappedBy = "pessoa", fetch = FetchType.EAGER)
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	
	@ManyToMany(fetch = FetchType.EAGER, targetEntity = Endereco.class)
	@JoinTable(name = "tb_pessoa_endereco")
	private Set<Endereco> enderecos = new HashSet<Endereco>();
	
	public PessoaEntity() {
		this(null, null, null, null, null);
	}

	public PessoaEntity(Long id, String nome, LocalDate nascimento, Set<Usuario> usuarios, Set<Endereco> enderecos) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.usuarios = usuarios;
		this.enderecos = enderecos;
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

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}
