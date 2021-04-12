package br.theus.zowysky.zcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.theus.zowysky.zcompany.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short>{

}
