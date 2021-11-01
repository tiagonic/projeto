package br.com.tbs.ProjetoTeste.pessoa;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import br.com.tbs.ProjetoTeste.endereco.EnderecoDTO;
import br.com.tbs.ProjetoTeste.usuario.UsuarioDTO;

public class PessoaDTO implements Serializable, Comparable<PessoaDTO> {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Date nascimento;
	private Set<EnderecoDTO> enderecos;
	private Set<UsuarioDTO> usuarios;

	public PessoaDTO() {
		this(null, null, null, null, null);
	}

	public PessoaDTO(PessoaEntity entity) {
		this(entity.getId(), entity.getNome(), entity.getNascimento(), entity.getEnderecosDTO(), entity.getUsuariosDTO());
	}

	public PessoaDTO(Long id, String nome, Date dt, Set<EnderecoDTO> es, Set<UsuarioDTO> us) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = dt;
		this.enderecos = es;
		this.usuarios = us;
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

	public Set<EnderecoDTO> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Set<EnderecoDTO> e) {
		this.enderecos = e;
	}

	public Set<UsuarioDTO> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<UsuarioDTO> u) {
		this.usuarios = u;
	}

	@Override
	public int compareTo(PessoaDTO o) {
		return nome.compareTo(o.getNome());
	}

	@Override
	public boolean equals(Object o) {
		return (o instanceof PessoaDTO && nome.equals(((PessoaDTO) o).getNome()));
	}

	@Override
	public int hashCode() {
		return Integer.parseInt( this.id.toString() );
	}

}
