package br.com.tbs.ProjetoTeste.pessoa;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.tbs.ProjetoTeste.endereco.EnderecoDTO;
import br.com.tbs.ProjetoTeste.endereco.EnderecoEntity;
import br.com.tbs.ProjetoTeste.usuario.UsuarioDTO;
import br.com.tbs.ProjetoTeste.usuario.UsuarioEntity;

@Entity(name = "pessoa")
@Table(name = "tb_pessoa")
public class PessoaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Date nascimento;

	@OneToMany(mappedBy = "pessoa")
	private Set<UsuarioEntity> usuarios = new HashSet<UsuarioEntity>();

	@ManyToMany
	@JoinTable(name = "tb_pessoa_endereco")
	private Set<EnderecoEntity> enderecos = new HashSet<EnderecoEntity>();

	public PessoaEntity() {
		this(null, null, null, null, null);
	}

	public PessoaEntity(Long id, String nome, Date dt, Set<UsuarioEntity> u, Set<EnderecoEntity> e) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = dt;
		this.usuarios = u;
		this.enderecos = e;
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

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date dt) {
		this.nascimento = dt;
	}

	public Set<UsuarioEntity> getUsuarios() {
		return usuarios;
	}

	public Set<UsuarioDTO> getUsuariosDTO() {
		return usuarios.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toSet());
	}

	public void setUsuarios(Set<UsuarioEntity> s) {
		this.usuarios = s;
	}

	public Set<EnderecoEntity> getEnderecos() {
		return enderecos;
	}

	public Set<EnderecoDTO> getEnderecosDTO() {
		return getEnderecos().stream().map(x -> new EnderecoDTO(x)).collect(Collectors.toSet());
	}

	public void setEnderecos(Set<EnderecoEntity> s) {
		this.enderecos = s;
	}

}
