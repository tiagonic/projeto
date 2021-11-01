package br.com.tbs.ProjetoTeste.usuario;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.tbs.ProjetoTeste.pessoa.PessoaEntity;

@Entity
@Table(name = "tb_user")
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic(optional = false)
	private String login;

	@Column(name = "passwd")
	private String senha;
	
	@ManyToOne(targetEntity = PessoaEntity.class)
	@JoinColumn(name = "pessoa_id")
	private PessoaEntity pessoa;

	public UsuarioEntity() {
		this(null, null, null, null);
	}

	public UsuarioEntity(Long id, String login, String senha, PessoaEntity pessoa) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

}
