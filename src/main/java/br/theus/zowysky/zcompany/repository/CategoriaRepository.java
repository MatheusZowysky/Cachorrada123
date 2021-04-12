package br.theus.zowysky.zcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.theus.zowysky.zcompany.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {

}
