package br.theus.zowysky.zcompany.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zowysky")
public class ControllerZ {
	@RequestMapping("/ola")
	public String exibirmensagem () {
		return "Oi bb";
	}

}
