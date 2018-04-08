package br.aula.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPRESTIMO")
public class Emprestimo {
	
	@Id
	@GeneratedValue
	@Column(name="idEmprestimo")
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dtEmprestimo", nullable=true)
	private Date dtEmprestimo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dtDevolucao", nullable=true)
	private Date dtDevolucao;
	
	@ManyToOne
	@JoinColumn(name="idLivro")
	
	private Livro livro;
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne
	@JoinColumn(name="idUsuario")
	
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDtEmprestimo() {
		return dtEmprestimo;
	}

	public void setDtEmprestimo(Date dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

	public Date getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	

	
}
