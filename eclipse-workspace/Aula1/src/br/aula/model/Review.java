package br.aula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REVIEW")
public class Review {

	@Id
	@GeneratedValue
	@Column(name="idReview")
	private Long id;
	
	@Column(name="avaliacao", nullable=true, length=100)
	private int avaliacao;
	
	@Column(name="comentario", nullable=true, length=100)
	private String comentario;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="idLivro")
	
	private Livro livro;


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
