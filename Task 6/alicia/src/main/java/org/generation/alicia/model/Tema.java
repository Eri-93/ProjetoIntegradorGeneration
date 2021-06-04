package org.generation.alicia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "tb_tema")
public class Tema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String descricao;
	
	private long qtdPostagem;
	
	private boolean tendeciaSemana;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQtdPostagem() {
		return qtdPostagem;
	}

	public void setQtdPostagem(long qtdPostagem) {
		this.qtdPostagem = qtdPostagem;
	}

	public boolean isTendeciaSemana() {
		return tendeciaSemana;
	}

	public void setTendeciaSemana(boolean tendeciaSemana) {
		this.tendeciaSemana = tendeciaSemana;
	}
	
	
}
