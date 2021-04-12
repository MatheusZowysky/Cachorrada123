package br.theus.zowysky.armazemCristal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.theus.zowysky.armazemCristal.domain.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Short> {

}
