package br.theus.zowysky.armazemCristal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/armazem")
public class ArmazemController {
	@RequestMapping("/boasvindas")
	public String exibirMensagam() {
		return "Seja Bem Vindo ao Armazem Cristal !";
	}
	

}

