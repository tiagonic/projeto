package br.jus.tse.ProjetoTeste.endereco;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.jus.tse.ProjetoTeste.pessoa.PessoaEntity;

@Entity
@Table(name = "tb_endereco")
public class EnderecoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	@ManyToMany(mappedBy = "enderecos", fetch = FetchType.EAGER, targetEntity = PessoaEntity.class)
	Set<PessoaEntity> pessoas = new HashSet<PessoaEntity>();

	public EnderecoEntity() {
		this(null, null, null);
	}

	public EnderecoEntity(Long id, String descricao, Set<PessoaEntity> pessoas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.pessoas = pessoas;
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

	public Set<PessoaEntity> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Set<PessoaEntity> pessoas) {
		this.pessoas = pessoas;
	}

}
