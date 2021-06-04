package org.generation.alicia.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date data_nascimento;
	
	@NotNull
	@UniqueElements
	@Size(min = 5, max = 255 )
	private String login;
	
	@NotNull
	@Size(min=5, max = 30)
	private String senha;
	
	@Size(max=100)
	private String nome_startup;
	
	@Size(min= 5, max=500)
	private String resumo;
	
	@Size(max=2048)
	private String link_linkedin;
	
	@Size(max=2048)
	private String link_instagram;
	
	@Size(max=2048)
	private String link_facebook;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
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

	public String getNome_Startup() {
		return nome_startup;
	}

	public void setNome_Startup(String nome_startup) {
		this.nome_startup = nome_startup;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getLink_linkedin() {
		return link_linkedin;
	}

	public void setLink_linkedin(String link_linkedin) {
		this.link_linkedin = link_linkedin;
	}

	public String getLink_Instagram() {
		return link_instagram;
	}

	public void setLink_Instagram(String link_instagram) {
		this.link_instagram = link_instagram;
	}

	public String getLink_facebook() {
		return link_facebook;
	}

	public void setLink_facebook(String link_facebook) {
		this.link_facebook = link_facebook;
	}
	
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
