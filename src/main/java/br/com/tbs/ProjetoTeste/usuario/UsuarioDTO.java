package br.com.tbs.ProjetoTeste.usuario;

import java.io.Serializable;

import br.com.tbs.ProjetoTeste.pessoa.PessoaDTO;

public class UsuarioDTO implements Serializable, Comparable<UsuarioDTO>{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String login;
	private String senha;
	private PessoaDTO pessoa;

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(UsuarioEntity entity) {
		this.id = entity.getId();
		this.login = entity.getLogin();
		this.senha = entity.getSenha();
	}

	@Override
	public int compareTo(UsuarioDTO o) {
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		return (o instanceof UsuarioDTO && login.equals(((UsuarioDTO) o).getLogin()));
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

	public PessoaDTO getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaDTO pessoa) {
		this.pessoa = pessoa;
	}

}
