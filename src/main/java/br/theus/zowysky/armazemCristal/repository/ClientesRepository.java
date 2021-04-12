package br.theus.zowysky.armazemCristal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.theus.zowysky.armazemCristal.domain.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, String> {
// Caso queiramos utilizar um inteiro, teremos que utilizar o Interger.
}
