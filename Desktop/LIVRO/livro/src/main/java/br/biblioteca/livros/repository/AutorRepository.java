package br.biblioteca.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import br.biblioteca.livros.beans.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {

}
