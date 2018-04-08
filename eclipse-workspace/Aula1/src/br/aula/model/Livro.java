package br.aula.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIVRO")
public class Livro {

	@Id
	@GeneratedValue
	@Column(name="idLivro")
	private Long idLivro;
	
	@Column(name="titulo", nullable=true, length=100)
	private String titulo;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="quantidade", nullable=true, length=100)
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name="idAutor")
	private Autor autor;
	
	@OneToMany(mappedBy="livro")
	private List<Emprestimo> emprestimo = new ArrayList<>();
	
	@OneToMany(mappedBy="livro")
	
	private List<Review> review = new ArrayList<>();
	
	
	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}

	public List<Emprestimo> getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(List<Emprestimo> emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
