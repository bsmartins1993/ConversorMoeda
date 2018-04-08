package br.aula.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name="idUsuario")
	private Long id;
	
	@Column(name="username", nullable=true, length=100)
	private String username;
	
	@Column(name="email", nullable=true, length=100)
	private String email;
	
	@Column(name="password", nullable=true, length=100)
	private String password;
	
	@OneToMany(mappedBy="usuario")
	
	private List<Emprestimo> emprestimo = new ArrayList<>();
	
	@OneToMany(mappedBy = "usuario")
	
	private List<Review> review = new ArrayList<>();
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
